package com.company.entity.employees;

import com.company.entity.Employee;

public class Manager extends Employee {
	
	public Manager(int ID, String name, int salary, int age) {
		super(ID, name, salary, age);
		this.access = true;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", salary=" + salary + ", age=" + age + ", access=" + access + "]";
	}
    
}
