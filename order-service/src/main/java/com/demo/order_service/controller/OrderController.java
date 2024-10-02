package com.demo.order_service.controller;

import com.demo.order_service.entity.OrderSer;
import com.demo.order_service.service.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    OrderService service;

    @PostMapping("/create")
    public OrderSer create(@RequestBody OrderSer order){
        return service.createOrder(order);
    }

    @GetMapping("/get/{id}")
    public OrderSer get(@RequestBody int id){
        return service.getOrder(id);
    }

    @GetMapping("/all")
    public List<OrderSer> allOrders(){
        return service.getAll();
    }

    @GetMapping("/user/{uid}")
    public List<OrderSer> byUser(@PathVariable int uid){
        return service.byUser(uid);
    }
}
