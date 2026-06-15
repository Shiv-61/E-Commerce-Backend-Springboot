package org.example.ecommercespringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.ecommercespringboot.Models.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
