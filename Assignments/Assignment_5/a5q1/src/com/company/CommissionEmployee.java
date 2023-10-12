package com.company;

import java.util.Scanner;

public class CommissionEmployee extends Employee {

	private int grossSales;
	private double commissionRate=100;
	
	
	public CommissionEmployee(int grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}



	public CommissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CommissionEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
		// TODO Auto-generated constructor stub
	}

@Override
public void accept() {
	// TODO Auto-generated method stub
	super.accept();
	System.out.print("Enter Gross Sales = ");
	this.grossSales = new Scanner(System.in).nextInt();
}

	@Override
	public void totalSalary() {
		System.out.println("Total Salary = "+commissionRate*grossSales);

	}

}
