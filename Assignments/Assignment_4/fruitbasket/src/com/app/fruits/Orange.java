package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		this("orange", 0.0, true);
		
	}

	public Orange(String color, double weight, boolean isFresh) {
		super("Orange", color, weight, isFresh);
		// TODO Auto-generated constructor stub
	}
	
	public String taste() {
		return "sour";
	}
	@Override
	public void acceptFruit() {
		// TODO Auto-generated method stub
		super.acceptFruit();
	}
}
