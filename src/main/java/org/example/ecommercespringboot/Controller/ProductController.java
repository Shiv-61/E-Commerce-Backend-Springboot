package org.example.ecommercespringboot.Controller;

import org.example.ecommercespringboot.Models.Product;
import org.example.ecommercespringboot.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Products")
public class ProductController {
    private final ProductService ProductService;

    public ProductController(ProductService ProductService){
        this.ProductService = ProductService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.ok(ProductService.getAllProducts());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getProduct(@PathVariable Long id){
        return ResponseEntity.ok(ProductService.getProduct(id));
    }
    @PostMapping()
    public ResponseEntity<Product> createProduct(@RequestBody Product Product){
        return ResponseEntity.ok(ProductService.createProduct(Product));
    }
}
