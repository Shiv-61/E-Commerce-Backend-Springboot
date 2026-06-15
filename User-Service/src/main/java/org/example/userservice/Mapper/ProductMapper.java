package org.example.ecommercespringboot.Mapper;

import org.example.ecommercespringboot.DTO.ProductDTO.ProductResponse;
import org.example.ecommercespringboot.Models.Product;

public class ProductMapper {

    public static ProductResponse toResponse(
            Product product) {

        return new ProductResponse(
                product.getId(),
                product.getProductName(),
                product.getPrice()
        );
    }
}