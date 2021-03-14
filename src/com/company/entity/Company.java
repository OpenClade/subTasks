package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private int ID;
	private String name;
	private List<Employee> employees = new ArrayList<Employee>();
	private int rate;
	
	public Company(int ID, String name, List<Employee> employees, int rate) {
		this.ID = ID;
		this.name = name;
		this.employees = employees;
		this.rate = rate;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
