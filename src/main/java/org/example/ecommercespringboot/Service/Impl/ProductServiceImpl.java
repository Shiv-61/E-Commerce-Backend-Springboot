package org.example.ecommercespringboot.Service.Impl;

import org.example.ecommercespringboot.Models.Product;
import org.example.ecommercespringboot.Repository.ProductRepository;
import org.example.ecommercespringboot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product updateProduct = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        updateProduct.setPrice(product.getPrice());
        updateProduct.setProductName(product.getProductName());
        return updateProduct;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
            Product deleteProduct = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
            productRepository.delete(deleteProduct);
    }
}