package org.example.ecommercespringboot.Service.Impl;
import org.example.ecommercespringboot.DTO.OrderDTO.OrderRequest;
import org.example.ecommercespringboot.DTO.OrderDTO.OrderResponse;
import org.example.ecommercespringboot.Mapper.OrderMapper;
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
    public OrderResponse createOrder(
            OrderRequest request) {

        Order order = new Order();

        order.setUserId(request.getUserId());
        order.setOrderDate(request.getOrderDate());

        Order savedOrder =
                orderRepository.save(order);

        return OrderMapper.toResponse(
                savedOrder);
    }
    @Override
    public List<OrderResponse> getAllOrders() {

        return orderRepository.findAll()
                .stream()
                .map(OrderMapper::toResponse)
                .toList();
    }

    @Override
    public OrderResponse getOrder(Long id){

        Order order = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Order not Found"));

        return OrderMapper.toResponse(order);
    }
    @Override
    public OrderResponse updateOrder(Long id, OrderRequest updatedOrder) {

        Order existingOrder = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with id: " + id));
        existingOrder.setOrderDate(updatedOrder.getOrderDate());
        existingOrder.setUserId(updatedOrder.getUserId());
        existingOrder.setOrderDate(
                updatedOrder.getOrderDate());

        Order editedOrder =  orderRepository.save(existingOrder);
        return OrderMapper.toResponse(editedOrder);
    }

    @Override
    public void deleteOrder(Long id) {

        Order existingOrder = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with id: " + id));

        orderRepository.delete(existingOrder);
    }
}