package com.onlineShopping.ProductService.service;

import com.onlineShopping.ProductService.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);
    ProductDto updateProductDetails(ProductDto productDto, String id );
    ProductDto getProductDetailsBasedOnId(String id);

    List<ProductDto>getAllProsuctDetails();
    String  deleteProductDetails(String id );



}
