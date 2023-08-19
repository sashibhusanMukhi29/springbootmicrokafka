package com.onlineShopping.ProductService.controller;
import com.onlineShopping.ProductService.dto.ProductDto;
import com.onlineShopping.ProductService.service.serviceimp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImp productServiceImp;
    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.OK)
    public ProductDto createProductDetails(@RequestBody ProductDto productDto)
    {
        return productServiceImp.createProduct(productDto);
    }

}
