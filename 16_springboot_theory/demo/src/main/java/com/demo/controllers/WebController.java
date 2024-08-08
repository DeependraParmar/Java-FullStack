package com.demo.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;

@RestController
public class WebController {
	private ArrayList<Student> list;
	
	public WebController() {
		list = new ArrayList<Student>();
		list.add(new Student(101, "Vikas", 20, "CS", 8.78f));
		list.add(new Student(102, "Meena", 20, "IT", 7.23f));		
		list.add(new Student(103, "Gopal", 21, "CI", 9.93f));
	}
	
	@GetMapping("/")
	public String home() {
		return "Welcome to our app...";
	}
	
	@GetMapping("/list")
	public ArrayList<Student> list(){
		return this.list;
	}
	
	@GetMapping("/search/{roll}")
	public Student search(@PathVariable(value="roll") int rollno) {
		for(Student s : this.list) {
			if(s.getRoll() == rollno)
				return s;
		}
		
		return null;
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Student s) {
		this.list.add(s);
		return "Student added successfully";
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int roll) {
		for(Student s: this.list) {
			if(s.getRoll() == roll) {
				list.remove(s);
			}
		}
		
		return "Student Deleted Successfully";
	}
}
