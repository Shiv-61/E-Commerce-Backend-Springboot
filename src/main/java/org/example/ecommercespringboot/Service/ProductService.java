package org.example.ecommercespringboot.Service;

import org.example.ecommercespringboot.Models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);

    Optional<Product> getProduct(Long id);

    List<Product> getAllProducts();
    void deleteProduct(Long id);
}
