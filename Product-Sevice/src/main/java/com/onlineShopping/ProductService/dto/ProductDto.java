package com.onlineShopping.ProductService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private String id;
    private String name;
    private double price;
    private String description;
    private String  status;

}
