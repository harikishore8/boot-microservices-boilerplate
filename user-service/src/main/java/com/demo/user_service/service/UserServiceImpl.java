package com.demo.user_service.service;

import com.demo.user_service.Pojo.OrderPojo;
import com.demo.user_service.Pojo.UserPojo;
import com.demo.user_service.dao.UserRepository;
import com.demo.user_service.entity.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository urepo;

    @Override
    public User saveUser(User user) {
        return  urepo.save(user);
    }

    @Override
    public List<OrderPojo> getOrderByUser(int userId) {
        WebClient webClient = WebClient.create();
    
    List<OrderPojo> allOrders = webClient
            .get()
            .uri("http://localhost:8081/api/user/{userId}", userId)
            .retrieve()
            .bodyToFlux(OrderPojo.class)
            .collectList()
            .block();
    
    return allOrders;
    }

    private UserPojo mapToUser(User user){
        UserPojo userDto = new UserPojo();
        userDto.setUserId(user.getUserId());
        userDto.setName((user.getName()));
        return userDto;
    }
}
