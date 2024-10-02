package com.demo.user_service.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderPojo {
    private int orderId;
    private String product;
    private int price;
    private int userId;
}