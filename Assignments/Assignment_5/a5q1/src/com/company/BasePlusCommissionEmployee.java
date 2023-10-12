package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary = 5000;

	public BasePlusCommissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasePlusCommissionEmployee(int grossSales, double commissionRate) {
		super(grossSales, commissionRate);
		// TODO Auto-generated constructor stub
	}

	public BasePlusCommissionEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
		// TODO Auto-generated constructor stub
	}

	public BasePlusCommissionEmployee(int grossSales, double commissionRate, double baseSalary) {
		super(grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();

	}

	@Override
	public String toString() {
		return super.toString() + " BasePlusCommissionEmployee [baseSalary = " + baseSalary + "]";
	}

	public void increment(float raisePercentage) {
		this.baseSalary = (raisePercentage * this.baseSalary) / 100 + this.baseSalary;
		System.out.println("Salary Incremented by "+raisePercentage+"%.");

	}

}
