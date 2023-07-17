package com.springbootdemoapp.crud.example.repository;

import com.springbootdemoapp.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

