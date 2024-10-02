package com.demo.order_service.dao;

import com.demo.order_service.entity.OrderSer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderSer,Integer> {
    List<OrderSer> findByUserId(int userId);
}
