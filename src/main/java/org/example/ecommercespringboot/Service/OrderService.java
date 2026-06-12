package org.example.ecommercespringboot.Service;

import org.example.ecommercespringboot.DTO.OrderDTO.OrderRequest;
import org.example.ecommercespringboot.DTO.OrderDTO.OrderResponse;
import org.example.ecommercespringboot.Models.Order;

import java.util.List;
public interface OrderService {

    OrderResponse createOrder(
            OrderRequest request);

    OrderResponse getOrder(Long id);

    List<OrderResponse> getAllOrders();

    OrderResponse updateOrder(
            Long id,
            OrderRequest request);

    void deleteOrder(Long id);
}