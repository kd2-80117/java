package com.app.fruits;

public class Apple extends Fruit{

	public Apple() {
	this("red", 0.0, true);
		// TODO Auto-generated constructor stub
	}

	
	public Apple(String color, double weight, boolean isFresh) {
		super("Apple", color, weight, isFresh);
		// TODO Auto-generated constructor stub
	}


	public String taste() {
		return "sweet n sour";
	}

	@Override
	public void acceptFruit() {
		// TODO Auto-generated method stub
		super.acceptFruit();
	}
}
