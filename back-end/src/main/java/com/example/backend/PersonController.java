package com.example.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

	private List<Person> persons = new ArrayList<>();

	public PersonController() {
		persons.add(new Person("Ram", "Hyderabad", 30));
		persons.add(new Person("Manohar", "Guntur", 31));
		persons.add(new Person("Ramesh", "Tenali", 32));
		persons.add(new Person("Venkat", "Ongole", 33));
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Hello World";
	}

	@GetMapping("/persons")
	public List<Person> getPersons() {
		return persons;
	}

}
