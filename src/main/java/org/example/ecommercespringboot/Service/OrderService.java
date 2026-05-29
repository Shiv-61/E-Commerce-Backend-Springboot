package org.example.ecommercespringboot.Service;

import org.example.ecommercespringboot.Models.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getAllOrders();
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);
}
