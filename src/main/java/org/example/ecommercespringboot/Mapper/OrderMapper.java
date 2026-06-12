package org.example.ecommercespringboot.Mapper;

import org.example.ecommercespringboot.DTO.OrderDTO.OrderResponse;
import org.example.ecommercespringboot.Models.Order;

public class OrderMapper {

    public static OrderResponse toResponse(
            Order order) {

        return new OrderResponse(
                order.getId(),
                order.getUserId(),
                order.getOrderDate()
        );
    }
}