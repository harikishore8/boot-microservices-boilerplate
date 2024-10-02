package com.demo.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.user_service.Pojo.OrderPojo;
import com.demo.user_service.entity.User;
import com.demo.user_service.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/user/{id}")
    public List<OrderPojo> getOrderByUser(@PathVariable int id){
        return service.getOrderByUser(id);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return service.saveUser(user);
    }
    
}
