package com.app.fruits;

public class Mango extends Fruit{

	public Mango() {
		this("yellow", 0.0, true);
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, double weight, boolean isFresh) {
		super("Mango", color, weight, isFresh);
		// TODO Auto-generated constructor stub
	}
	
	public String taste() {
		return "sweet";
	}
	@Override
	public void acceptFruit() {
		// TODO Auto-generated method stub
		super.acceptFruit();
	}
}
