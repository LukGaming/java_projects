package com.product_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_crud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
