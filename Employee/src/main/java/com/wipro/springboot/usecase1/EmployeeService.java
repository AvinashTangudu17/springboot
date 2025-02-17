package com.wipro.springboot.usecase1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	private final Map<Integer, Employee> employeeMap = new HashMap<>();

	public String addEmployee(Employee employee){
		employee.setDesignation(assignRole(employee.getRole()));
		employeeMap.put(employee.getId(), employee);
		System.out.println("Employee added: "+employee);
		return "Employee added with ID: "+employee.getId();

	}

	public Employee getEmployee(int id) {
	    Employee employee = employeeMap.get(id);
	    if (employee == null) {
	        System.out.println("Employee with ID " + id + " not found");  // Debugging line
	    }
	    return employee;
	}

	private String assignRole(String role) {
		return switch (role.toLowerCase()) {
		case "developer" ->"Developer";
		case "tester" -> "Tester";
		case "architect" -> "Architect";
		default -> "Unkown Role";
		};
	}
}
