package org.example.ecommercespringboot.DTO.OrderDTO;

import java.time.LocalDateTime;

public class OrderResponse {

    private Long id;
    private Long userId;
    private LocalDateTime orderDate;

    public OrderResponse(
            Long id,
            Long userId,
            LocalDateTime orderDate) {

        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}