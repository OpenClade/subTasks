package com.company.entity.aquariums;

public class Reptile extends Fish {
	 
	public Reptile(String name, int price, String type) {
		super(name, price, type);
		// TODO Auto-generated constructor stub
	}
    public String getType() {
		return "reptile";
    	
    };
    @Override
    public int getPrice() {
    	// TODO Auto-generated method stub
    	return super.getPrice() * 2;
    }
}
