package org.example.ecommercespringboot.Service;

import org.example.ecommercespringboot.DTO.ProductDTO.ProductRequest;
import org.example.ecommercespringboot.DTO.ProductDTO.ProductResponse;
import org.example.ecommercespringboot.Models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    ProductResponse createProduct(ProductRequest request);

    ProductResponse updateProduct(
            Long id,
            ProductRequest request);

    ProductResponse getProduct(Long id);

    List<ProductResponse> getAllProducts();
}
