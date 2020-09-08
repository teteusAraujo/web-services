package com.mateus.webservices.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mateus.webservices.entities.Order;
import com.mateus.webservices.entities.User;
import com.mateus.webservices.respositories.OrderRepository;
import com.mateus.webservices.respositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Mateus Araújo", "mateusaraujo996@gmail.com", "11977656705", "naruto10");
		User u2 = new User(null, "Samuel Araújo", "samuel@gmail.com", "11977777777", "joyce123"); 
		
		Order o1 = new Order(null, Instant.parse("2020-08-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2020-08-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2020-08-22T15:21:22Z"), u1); 

		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}

}
