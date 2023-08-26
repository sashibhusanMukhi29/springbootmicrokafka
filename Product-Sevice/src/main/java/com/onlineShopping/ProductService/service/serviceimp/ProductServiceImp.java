package com.onlineShopping.ProductService.service.serviceimp;

import com.onlineShopping.ProductService.dto.ProductDto;

import com.onlineShopping.ProductService.entity.Product;
import com.onlineShopping.ProductService.repository.MomngoRepository;
import com.onlineShopping.ProductService.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ModelMapper modelMapper;
@Autowired
private MomngoRepository momngoRepository;
    @Override
    public ProductDto createProduct(ProductDto productDto) {
        productDto.setStatus("ACTIVE");
        return modelMapper.map(momngoRepository.save(modelMapper.map(productDto, Product.class)),ProductDto.class);
    }

    @Override
    public ProductDto updateProductDetails(ProductDto productDto, String id) {
        Product product = momngoRepository.findById(id).get();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        return modelMapper.map(momngoRepository.save(product),ProductDto.class);
    }

    @Override
    public ProductDto getProductDetailsBasedOnId(String id) {
        return modelMapper.map( momngoRepository.findById(id).get(),ProductDto.class);
    }

    @Override
    public List<ProductDto> getAllProsuctDetails() {
        List<ProductDto> productDtoList = momngoRepository.findAll().stream().filter(obj-> obj.getStatus().equalsIgnoreCase("active")).map((obj) -> modelMapper.map(obj, ProductDto.class)).toList();
        return productDtoList;
    }

    @Override
    public String deleteProductDetails(String id) {

        Product product = momngoRepository.findById(id).get();
        product.setStatus("INACTIVE");
        momngoRepository.save(product);
        return "deleted Sucessfully";
    }
}
