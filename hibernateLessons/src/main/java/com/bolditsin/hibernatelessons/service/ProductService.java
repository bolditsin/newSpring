package com.bolditsin.hibernatelessons.service;

import com.bolditsin.hibernatelessons.model.Product;
import com.bolditsin.hibernatelessons.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public Product findById(Long id){
        return productRepository.findById(id).orElse(null);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    public void deleteById(Long id){
        productRepository.deleteById(id);
    }
}
