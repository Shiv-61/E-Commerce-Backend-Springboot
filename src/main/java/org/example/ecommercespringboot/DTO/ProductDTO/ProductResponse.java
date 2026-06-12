package org.example.ecommercespringboot.DTO.ProductDTO;

public class ProductResponse {

    private long id;
    private String productName;
    private double price;

    public ProductResponse() {
    }

    public ProductResponse(long id,
                           String productName,
                           double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}