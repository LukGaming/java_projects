package com.product_crud.controllers;

import com.product_crud.entities.Category;
import com.product_crud.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryController;

    @PostMapping
    Category post(@RequestBody Category category) {
        return categoryController.save(category);
    }

    @GetMapping("")
    public List<Category> get() {
        return categoryController.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable Integer id) {
        return categoryController.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        categoryController.deleteById(id);
    }
}