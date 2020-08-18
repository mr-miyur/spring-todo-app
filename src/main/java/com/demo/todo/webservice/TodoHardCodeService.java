package com.demo.todo.webservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodeService {

	private static List<Todo> todos=new ArrayList();
	private static int idCounter =0;
	
	static {
		todos.add(new Todo(++idCounter, "in28minitues", "Learn react", new Date(),"false"));
		todos.add(new Todo(++idCounter, "in28minitues", "Learn microservice", new Date(),"false"));
		todos.add(new Todo(++idCounter, "in28minitues", "Learn Jenkins", new Date(),"false"));
		todos.add(new Todo(++idCounter, "in28minitues", "Learn Angular", new Date(),"false"));
	}
		
	
	public List<Todo> findAll() {
		return todos;
		
	}
	
	public Todo deleteById(int id) {
		Todo todo = findById(id);
		if(todo!=null) {
			todos.remove(todo);
			return todo;
		}
		return null;
	}

	private Todo findById(int id) {
		for(Todo todo : todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
}
