package com.onlineShopping.ProductService.controller;
import com.onlineShopping.ProductService.dto.ProductDto;
import com.onlineShopping.ProductService.service.serviceimp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImp productServiceImp;
    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ProductDto createProductDetails(@RequestBody ProductDto productDto)
    {
        return productServiceImp.createProduct(productDto);
    }
    @PutMapping("/update")
    @ResponseStatus(value = HttpStatus.OK)
    public ProductDto updateProductDetails(@RequestBody ProductDto productDto,@RequestParam("id") String id )
    {

      return   productServiceImp.updateProductDetails(productDto,id);
    }
    @GetMapping("/getAll")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ProductDto> updateProductDetails( )
    {

        return   productServiceImp.getAllProsuctDetails();
    }


}
