package com.example.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// IoC Container is started
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/ioc/appCxt.xml");

		// NoN IoC Style of programming
		// CalculatorService calculatorService = new CalculatorService();

		// IoC Style of programming
		CalculatorService calculatorService = (CalculatorService) applicationContext.getBean("calculatorService");
		System.out.println(calculatorService.doSum(10, 2));
		System.out.println(calculatorService.doDiff(10, 2));

		// Caller 1
		BookService bookService = (BookService) applicationContext.getBean("bookService");
		System.out.println(bookService);
		System.out.println(bookService.hashCode());

		bookService.addBook();
		bookService.listBooks();

		// Caller 2
		BookService bookService1 = (BookService) applicationContext.getBean("bookService");
		System.out.println(bookService1);
		System.out.println(bookService1.hashCode());

		bookService1.addBook();
		bookService1.listBooks();

		// IoC Container is stopped
		applicationContext.close();

	}
}
