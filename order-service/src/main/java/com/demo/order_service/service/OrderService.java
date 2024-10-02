package com.demo.order_service.service;


import java.util.List;

import org.springframework.stereotype.Service;


import com.demo.order_service.entity.OrderSer;

@Service
public interface OrderService {
    OrderSer createOrder(OrderSer order);
    OrderSer getOrder(int id);
    List<OrderSer> getAll();
    List<OrderSer> byUser(int uid);
}
