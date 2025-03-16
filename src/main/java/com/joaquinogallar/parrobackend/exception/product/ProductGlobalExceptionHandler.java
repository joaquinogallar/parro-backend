package com.joaquinogallar.parrobackend.exception.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ProductGlobalExceptionHandler {

    public ResponseEntity<ProductErrorResponse> handleException(Exception ex) {
        ProductErrorResponse response = new ProductErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
