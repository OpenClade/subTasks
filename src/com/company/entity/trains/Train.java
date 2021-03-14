package com.company.entity.trains;

import java.util.ArrayList;
import java.util.List;

public class Train {
	private int ID;
	private List<Passenger> passengers = new ArrayList<Passenger>();
	private String name;
	
	public Train(int iD, List<Passenger> passengers, String name) {
		super();
		ID = iD;
		this.passengers = passengers;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Train [ID=" + ID + ", passengers=" + passengers + ", name=" + name + "]";
	}
	
}
