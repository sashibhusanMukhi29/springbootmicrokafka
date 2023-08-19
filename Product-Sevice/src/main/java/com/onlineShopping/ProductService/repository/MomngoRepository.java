package com.onlineShopping.ProductService.repository;

import com.onlineShopping.ProductService.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MomngoRepository  extends MongoRepository<Product,String> {
}
