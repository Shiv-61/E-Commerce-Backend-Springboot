package org.example.ecommercespringboot.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// these lombok annotation add the getter and setter automatically we don't  need to make the methods
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "Price(inr)")
    private double price;
}
