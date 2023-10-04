package com.onlineShopping.orderservice.service;

import com.onlineShopping.orderservice.entity.OrderCart;

import java.util.List;

public interface OrderCartService {
    OrderCart createOrder(OrderCart orderCart);
    List<OrderCart>getAllOrderDetails(Long id);
}
