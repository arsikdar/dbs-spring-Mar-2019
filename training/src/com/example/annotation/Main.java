package com.example.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// IoC Container is started
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfig.class);

		BookService bookService = applicationContext.getBean("bookService", BookService.class);
		bookService.addBook();
		bookService.listBooks();
		
		CalculatorService calculatorService = applicationContext.getBean("calculatorService",CalculatorService.class);
		System.out.println(calculatorService.doSum(10, 2));
		System.out.println(calculatorService.doDiff(10, 2));


		// IoC Container is stopped
		applicationContext.close();

	}
}
