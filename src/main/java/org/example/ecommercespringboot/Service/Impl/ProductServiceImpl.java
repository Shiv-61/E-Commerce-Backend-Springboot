package org.example.ecommercespringboot.Service.Impl;

import org.example.ecommercespringboot.DTO.ProductDTO.ProductRequest;
import org.example.ecommercespringboot.DTO.ProductDTO.ProductResponse;
import org.example.ecommercespringboot.Mapper.ProductMapper;
import org.example.ecommercespringboot.Models.Product;
import org.example.ecommercespringboot.Repository.ProductRepository;
import org.example.ecommercespringboot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductResponse createProduct(
            ProductRequest request) {

        Product product = new Product();

        product.setProductName(
                request.getProductName());

        product.setPrice(
                request.getPrice());

        Product savedProduct =
                productRepository.save(product);

        return ProductMapper.toResponse(
                savedProduct);
    }

    @Override
    public ProductResponse updateProduct(
            Long id,
            ProductRequest request) {

        Product product =
                productRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Product not found"));

        product.setProductName(
                request.getProductName());

        product.setPrice(
                request.getPrice());

        Product updated =
                productRepository.save(product);

        return ProductMapper.toResponse(
                updated);
    }

    @Override
    public ProductResponse getProduct(
            Long id) {

        Product product =
                productRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Product not found"));

        return ProductMapper.toResponse(
                product);
    }

    @Override
    public List<ProductResponse>
    getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toResponse)
                .toList();
    }
}