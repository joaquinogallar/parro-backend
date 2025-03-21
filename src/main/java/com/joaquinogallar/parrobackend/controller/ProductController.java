package com.joaquinogallar.parrobackend.controller;

import com.joaquinogallar.parrobackend.entity.Product;
import com.joaquinogallar.parrobackend.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable UUID productId) {
        Product p = productService.getProductById(productId);
        return ResponseEntity.ok(p);
    }

    @GetMapping("/{productName}")
    public ResponseEntity<Optional<Product>> getProductByName(@PathVariable String productName) {
        Optional<Product> p = productService.getProductByName(productName);
        return ResponseEntity.ok(p);
    }
}
