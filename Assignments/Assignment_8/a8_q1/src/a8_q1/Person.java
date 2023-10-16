package a8_q1;

import java.util.Scanner;

public class Person {
	private String name;

	public Person() {
		
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void accept() {
		System.out.print("Enter Name = ");
		this.name = new Scanner(System.in).next();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
