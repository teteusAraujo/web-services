package com.mateus.webservices.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mateus.webservices.entities.Category;
import com.mateus.webservices.entities.Order;
import com.mateus.webservices.entities.Product;
import com.mateus.webservices.entities.User;
import com.mateus.webservices.entities.enuns.OrderStatus;
import com.mateus.webservices.respositories.CategoryRepository;
import com.mateus.webservices.respositories.OrderRepository;
import com.mateus.webservices.respositories.ProductRepository;
import com.mateus.webservices.respositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers"); 
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

		
		User u1 = new User(null, "Mateus Araújo", "mateusaraujo996@gmail.com", "11977656705", "naruto10");
		User u2 = new User(null, "Samuel Araújo", "samuel@gmail.com", "11977777777", "joyce123"); 
		
		Order o1 = new Order(null, Instant.parse("2020-08-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2020-08-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2020-08-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1); 
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	
	}

}
