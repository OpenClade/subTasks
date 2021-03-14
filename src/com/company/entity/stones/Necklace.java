package com.company.entity.stones;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
	
	private int ID;
	private String name;
	private List<PreciousStone> preciousStones = new ArrayList<PreciousStone>();
	private List<SemiPreciousStone> semiPreciousStones = new ArrayList<SemiPreciousStone>();
	
	public Necklace(int iD, String name, List<PreciousStone> preciousStones,
			List<SemiPreciousStone> semiPreciousStones) {
		super();
		ID = iD;
		this.name = name;
		this.preciousStones = preciousStones;
		this.semiPreciousStones = semiPreciousStones;
	}
	public int calculateSumofNecklace() {
		int sum = 0;
		for(int i = 0; i < preciousStones.size(); i++) {
			sum += preciousStones.get(i).getPrice();
		}
		for(int i = 0; i < semiPreciousStones.size(); i++) {
			sum += semiPreciousStones.get(i).getPrice();
		}
		return sum;
	}
	public double calculateSumofWeight() {
		double sum = 0;
		for(int i = 0; i < preciousStones.size(); i++) {
			sum += preciousStones.get(i).getWeight();
		}
		for(int i = 0; i < semiPreciousStones.size(); i++) {
			sum += semiPreciousStones.get(i).getWeight();
		}
		return sum;
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
}
