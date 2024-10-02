package com.demo.user_service.service;

import com.demo.user_service.Pojo.OrderPojo;
import com.demo.user_service.entity.User;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User saveUser(User user);
    List<OrderPojo> getOrderByUser(int userId);
}
