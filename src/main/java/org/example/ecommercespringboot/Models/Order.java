package org.example.ecommercespringboot.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

// these lombok annotation add the getter and setter automatically we don't  need to make the methods
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order{
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "orderDate")
    private LocalDateTime orderDate;

    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id") // user_id is the foreign key that is the order owns the relationship
    private User user;

    // class containing @JoinColumn owns the relationship
}
