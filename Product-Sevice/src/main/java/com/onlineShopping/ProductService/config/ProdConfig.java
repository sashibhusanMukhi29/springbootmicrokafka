package com.onlineShopping.ProductService.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdConfig {
    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }

}
