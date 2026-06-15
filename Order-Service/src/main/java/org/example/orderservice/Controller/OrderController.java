package org.example.ecommercespringboot.Controller;

import org.example.ecommercespringboot.DTO.OrderDTO.OrderRequest;
import org.example.ecommercespringboot.DTO.OrderDTO.OrderResponse;
import org.example.ecommercespringboot.Service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<OrderResponse>> getAllOrder(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }
    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable Long id){
        return ResponseEntity.ok(orderService.getOrder(id));
    }
    @PostMapping()
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest order){
        return ResponseEntity.ok(orderService.createOrder(order));
    }
}
