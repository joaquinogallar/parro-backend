package com.joaquinogallar.parrobackend.controller;

import com.joaquinogallar.parrobackend.entity.Product;
import com.joaquinogallar.parrobackend.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping()
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        String message = productService.createProduct(product);
        return ResponseEntity.ok(message);
    }

}
