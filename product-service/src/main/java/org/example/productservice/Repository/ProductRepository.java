package org.example.ecommercespringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.ecommercespringboot.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
