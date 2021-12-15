package com.example.backend;

import java.util.UUID;

public class Person {

	private UUID id;
	private String name;
	private String address;
	private int age;

	public Person() {}
	
	public Person(String name, String address, int age) {
		super();
		this.id = UUID.randomUUID();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
