package com.product_crud.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.product_crud.entities.Product;
import com.product_crud.repositories.ProductRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/products")

public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("")
    public Product post(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
