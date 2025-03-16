package com.joaquinogallar.parrobackend.exception.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> handleProductNotFoundException(ProductNotFoundException ex) {
        ProductErrorResponse response = new ProductErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
