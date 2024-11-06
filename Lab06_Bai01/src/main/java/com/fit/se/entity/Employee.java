package com.fit.se.entity;

public class Employee {
	private int id;
	private String name;
	private Address address;

	public Employee() {
	}

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void show() {
		System.out.println("ID: " + id + " Name: " + name);
		System.out.println("Address: " + address.toString());
	}
}
