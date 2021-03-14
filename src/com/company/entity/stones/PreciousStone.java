package com.company.entity.stones;

public class PreciousStone {
	private int price;
	private String name;
	private double weight;
	public PreciousStone(int price, String name, double weight) {
		super();
		this.price = price;
		this.name = name;
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
