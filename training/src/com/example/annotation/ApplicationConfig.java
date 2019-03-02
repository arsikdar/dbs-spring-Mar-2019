package com.example.annotation;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages= {"com.example"})
public class ApplicationConfig {

	@Bean(initMethod = "init")
	@Scope("singleton")
	// @Lazy
	public BookService bookService() {
		return new BookService();
	}

	@Bean
	public BookDAO bookDAO() {
		return new BookDAO();
	}

	//Dependency Outjection
	@Bean
	public int bookID() {
		return (int)(Math.random()*Runtime.getRuntime().freeMemory()*System.nanoTime());
	}

	//Dependency Outjection
	@Bean
	public String currentTime() {
		return LocalDateTime.now().toString();
	}

}
