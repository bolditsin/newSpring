package com.bolditsin.controllers;

import com.bolditsin.entites.Product;
import com.bolditsin.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
public class ProductsController {
    @Controller
    public class ProductController {

        private ProductsService productsService;

        @Autowired
        public void setProductService(ProductsService productsService) {
            this.productsService = productsService;
        }

        @RequestMapping("/")
        public String index(Model uiModel) {
            return "index";
        }

        @RequestMapping(value = "/showProducts", method = RequestMethod.GET)
        public String viewProducts(Model uiModel) {
            uiModel.addAttribute("products", productsService.getProducts());
            return "view-products";
        }

        @RequestMapping("/addProduct")
        public String addProduct(Model uiModel) {
            uiModel.addAttribute("product", new Product());
            return "add-product";
        }

        @RequestMapping("/processForm")
        public String processForm(@ModelAttribute("product")Product product) {
            productsService.addProduct(product);
            return "redirect:viewProducts";
        }
    }
}
