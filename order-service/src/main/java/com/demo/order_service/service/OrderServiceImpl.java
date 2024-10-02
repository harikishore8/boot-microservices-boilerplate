package com.demo.order_service.service;


import com.demo.order_service.dao.OrderRepository;
import com.demo.order_service.entity.OrderSer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository Orepo;

    @Override
    public OrderSer createOrder(OrderSer order) {
        Orepo.save(order);
        return order;
    }

    @Override
    public OrderSer getOrder(int id) {
        return Orepo.findById(id).get();
    }

    @Override
    public List<OrderSer> getAll() {
        return Orepo.findAll();
    }

    @Override
    public List<OrderSer> byUser(int uid) {
        return Orepo.findByUserId(uid);
    }
}
