package com.company.entity.employees;

import java.util.ArrayList;
import java.util.List;

import com.company.entity.Employee;

public class Programmer extends Employee {
	String quality;
	public Programmer(int ID, String name, int salary, int age, String quality) {
		super(ID, name, salary, age);
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "Programmer [quality=" + quality + ", name=" + name + ", salary=" + salary + ", age=" + age + ", access="
				+ access + "]";
	}
	
    
    
}
