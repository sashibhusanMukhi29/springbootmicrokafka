package com.onlineShopping.ProductService.service.serviceimp;

import com.onlineShopping.ProductService.dto.ProductDto;

import com.onlineShopping.ProductService.entity.Product;
import com.onlineShopping.ProductService.repository.MomngoRepository;
import com.onlineShopping.ProductService.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ModelMapper modelMapper;
@Autowired
private MomngoRepository momngoRepository;
    @Override
    public ProductDto createProduct(ProductDto productDto) {
        return modelMapper.map(momngoRepository.save(modelMapper.map(productDto, Product.class)),ProductDto.class);
    }
}
