package com.onlineShopping.orderservice.repo;

import com.onlineShopping.orderservice.entity.OrderCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCartRepo extends JpaRepository<OrderCart,Long> {
}
