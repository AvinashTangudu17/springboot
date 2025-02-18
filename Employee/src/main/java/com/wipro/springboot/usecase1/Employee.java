package com.wipro.springboot.usecase1;

public class Employee {
	private int id;
	private String name;
	private String role;
	private String designation;

	public Employee() {}
	public Employee(int id,String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.designation = "";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", designation=" + designation + "]";
	}
}