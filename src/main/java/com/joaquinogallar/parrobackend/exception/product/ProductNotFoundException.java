package com.joaquinogallar.parrobackend.exception.product;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
