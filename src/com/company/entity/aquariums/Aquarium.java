package com.company.entity.aquariums;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
	
	List<Fish> accessories = new ArrayList<Fish>();
	private int ID;
	private String name;
	private int height;
	
	public Aquarium(List<Fish> accessories, int iD, String name, int height) {
		super();
		this.accessories = accessories;
		ID = iD;
		this.name = name;
		this.height = height;
	}

	public List<Fish> getAccessories() {
		return accessories;
	}

	public void setAccessories(List<Fish> accessories) {
		this.accessories = accessories;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
