package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh = true;

	public Fruit(String name, String color, double weight, boolean isFresh) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}

	public Fruit() {
		super();

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Name = " + name + ", Color = " + color + ", Weight = " + weight +", Taste = "+taste();

	}

	public boolean isFresh() {
		return isFresh;
	}

	public String taste() {
		return "no specific taste";
	}
	
	public void acceptFruit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color: ");
		this.color = sc.next();
		System.out.println("Enter weight: ");
		this.weight = sc.nextDouble();

	}
}
