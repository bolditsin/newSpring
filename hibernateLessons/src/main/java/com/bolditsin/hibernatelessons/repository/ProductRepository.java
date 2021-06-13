package com.bolditsin.hibernatelessons.repository;

import com.bolditsin.hibernatelessons.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //List<Product> findByTitle(String title);
}
