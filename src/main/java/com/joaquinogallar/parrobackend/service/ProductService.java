package com.joaquinogallar.parrobackend.service;

import com.joaquinogallar.parrobackend.entity.Product;
import com.joaquinogallar.parrobackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public String createProduct(Product product) {
        productRepository.save(product);
        return "created";
    }

    public Product getProductById(UUID id) {
        return productRepository.findById(id).orElse(null);
    }
}
