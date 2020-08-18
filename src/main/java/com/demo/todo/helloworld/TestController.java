package com.demo.todo.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {
	
	@GetMapping(value = "/hello")
	public String testMehtod() {
		System.out.println("Inside testMehtod");
		return"Welcome to Spring world";
	}

	
	@GetMapping(value = "/hello/pathvariable/{name}")
	public Person helloWorldPathVariableService(@PathVariable String name) {
		System.out.println("Inside helloWorldPathVariableService");
		//return  new Person(String.format("Welcome , %s", name),null);
		 throw new RuntimeException("Somthing went wrong");
	}
}


