package org.example.ecommercespringboot.Service.Impl;
import org.example.ecommercespringboot.Models.Order;
import org.example.ecommercespringboot.Repository.OrderRepository;
import org.example.ecommercespringboot.Service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(Long id, Order updatedOrder) {

        Order existingOrder = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with id: " + id));
        existingOrder.setOrderDate(updatedOrder.getOrderDate());
        existingOrder.setUser(updatedOrder.getUser());

        return orderRepository.save(existingOrder);
    }

    @Override
    public void deleteOrder(Long id) {

        Order existingOrder = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with id: " + id));

        orderRepository.delete(existingOrder);
    }
}