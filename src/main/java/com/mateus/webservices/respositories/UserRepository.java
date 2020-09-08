package com.mateus.webservices.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateus.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
