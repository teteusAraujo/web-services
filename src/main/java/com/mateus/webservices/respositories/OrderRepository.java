package com.mateus.webservices.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
