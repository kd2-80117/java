package com.company;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private double wage=500;
	private int hours;

	@Override
	public void totalSalary() {
		if (hours <= 40) {
			System.out.println("Total Salary = " + hours * wage);
		} else if (hours > 40) {
			System.out.println("Total Salary = " + 40 * wage + (hours - 40) * wage * 1.5);
		}

	}
@Override
public void accept() {
	// TODO Auto-generated method stub
	super.accept();
	System.out.print("Enter hours = ");
	this.hours = new Scanner(System.in).nextInt();
	
}
	@Override
	public String toString() {
	
		return super.toString()+" HourlyEmployee [wage = " + wage + ", hours =" + hours + "]";
	}

}
