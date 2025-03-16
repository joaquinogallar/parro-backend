package com.joaquinogallar.parrobackend.exception.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductErrorResponse {

    private int status;
    private String message;
    private long timestamp;

}
