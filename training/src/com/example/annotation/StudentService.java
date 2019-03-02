package com.example.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
@Lazy
public class StudentService {

	public StudentService() {
		System.out.println("Inside StudentService()!!!!!");
	}

	@PostConstruct
	public void init() {
		System.out.println("Inside StudentService.init()!!!!!");
	}

	@PreDestroy
	public void clean() {
		System.out.println("Inside StudentService.clean()!!!!!");
	}

	public void addStudent() {
		System.out.println("Inside StudentService.addStudent()!!!!!");
	}

	public void listAllStudents(){
		System.out.println("Inside StudentService.listAllStudents()!!!!!");
	}
}
