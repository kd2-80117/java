package com.company;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee() {
		super();
		this.weeklySalary = 10000;
	}

	@Override
	public void totalSalary() {
		System.out.println("Total Salary = "+weeklySalary);
		
	}

	@Override
	public String toString() {
		return super.toString()+" SalariedEmployee [weeklySalary = " + weeklySalary + "]";
	}
@Override
public void accept() {
	
	super.accept();
	
}

	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = 10000;
	}

	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	

}
