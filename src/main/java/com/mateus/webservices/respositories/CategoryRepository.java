package com.mateus.webservices.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
