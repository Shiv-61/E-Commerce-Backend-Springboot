package org.example.ecommercespringboot.DTO.OrderDTO;

import java.time.LocalDateTime;

public class OrderRequest {

    private Long userId;

    public OrderRequest() {
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDateTime getOrderDate() {
        return null;
    }
}