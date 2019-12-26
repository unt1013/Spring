package com.ddusi.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ddusi.basic.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}