package com.product_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_crud.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}