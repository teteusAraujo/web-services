package com.mateus.webservices.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
