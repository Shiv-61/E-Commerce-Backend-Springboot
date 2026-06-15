package org.example.ecommercespringboot.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.ecommercespringboot.DTO.UserDTO.UserResponse;

import java.time.LocalDateTime;

// these lombok annotation add the getter and setter automatically we don't  need to make the methods
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private LocalDateTime orderDate;

    private UserResponse userResponse;
}