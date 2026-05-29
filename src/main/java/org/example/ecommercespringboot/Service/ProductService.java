package org.example.ecommercespringboot.Service;

import org.example.ecommercespringboot.Models.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    List<Product> getAllProducts();
    void deleteProduct(Long id);
}
