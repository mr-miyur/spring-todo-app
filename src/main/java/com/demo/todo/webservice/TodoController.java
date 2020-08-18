package com.demo.todo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

	@Autowired
	private TodoHardCodeService todoHardCodeService;

	@GetMapping(value = "/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username) {
		return todoHardCodeService.findAll();
	}

	@DeleteMapping(value = "/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username , @PathVariable int id){
		
		Todo todo = todoHardCodeService.deleteById(id);
		if(todo !=null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.noContent().build();
	}
	
}
