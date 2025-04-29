package com;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return id+" "+name+" "+salary;
		
	}
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(1, "Ajay", 50000));
		employeeList.add(new Employee(2, "Sanja", 60000));
		employeeList.add(new Employee(3, "Vijay", 55000));

	        for (Employee e : employeeList) {
	           System.out.println(e);
	        }
	    }

}
