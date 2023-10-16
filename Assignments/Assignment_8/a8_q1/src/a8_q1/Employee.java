package a8_q1;

import java.util.Scanner;

public abstract class Employee extends Person {
	private int empid;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, double salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
	public Employee(String name, int empid, double salary) {
		super(name);
		this.empid = empid;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public void accept() {
		System.out.print("Enter empid = ");
		this.empid = new Scanner(System.in).nextInt();
		super.accept();
		System.out.print("Enter salary = ");
		this.salary = new Scanner(System.in).nextDouble();
	}
	public abstract void calculateSalary();
}
