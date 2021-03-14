package com.company.entity.trains;

public class Passenger {
	private int ID;
	private int side;
	private String name;
	
	public Passenger(int iD, int side, String name) {
		super();
		ID = iD;
		this.side = side;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Passenger [ID=" + ID + ", side=" + side + ", name=" + name + "]";
	}
	
	
}
