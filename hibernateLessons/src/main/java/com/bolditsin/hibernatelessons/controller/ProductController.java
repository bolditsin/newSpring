package com.bolditsin.hibernatelessons.controller;

import com.bolditsin.hibernatelessons.model.Product;
import com.bolditsin.hibernatelessons.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductController productController){
        this.productService = productController.productService;
    }
    @GetMapping("/products")
    public String findAll(Model model){
        List<Product> products= productService.findAll();
        model.addAttribute("products", products);
        return "product-list";
    }
    @GetMapping("/product-create")
    public String createProductForm(Product product){
        return "product-create";
    }

    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/products";

    }
}
