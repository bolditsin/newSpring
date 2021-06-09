package com.bolditsin.services;

import com.bolditsin.entites.Product;
import com.bolditsin.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductRepository(ProductsRepository productRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getProducts() {
        return productsRepository.getProducts();
    }

    public void addProduct(Product product) {
        productsRepository.addProduct(product);
    }
}