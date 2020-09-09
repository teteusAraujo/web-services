package com.mateus.webservices.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
