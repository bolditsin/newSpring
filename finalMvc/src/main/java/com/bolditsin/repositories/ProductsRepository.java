package com.bolditsin.repositories;

import com.bolditsin.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
    private List<Product> products;

    public ProductsRepository(){
        products= new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public Product getById(int id){
        if(id<0||id>products.size()){
            throw new IllegalArgumentException();
        }
    return products.get(id);
    }

    public List<Product> getProducts(){
        return products;
    }


}
