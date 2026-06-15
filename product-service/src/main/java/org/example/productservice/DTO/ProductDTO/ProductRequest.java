package org.example.ecommercespringboot.DTO.ProductDTO;

public class ProductRequest {

    private String productName;
    private double price;

    public ProductRequest() {
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}