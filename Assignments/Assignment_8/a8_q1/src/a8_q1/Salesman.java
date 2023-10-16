package a8_q1;

import java.util.Scanner;

public class Salesman extends Employee {
	private double comm;
	
	@Override
	public void accept() {
		
		super.accept();
		System.out.print("Enter Commission = ");
		this.comm = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public String toString() {
		return "Salesman [comm=" + comm + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void calculateSalary() {
		System.out.println("Total salary = "+(comm+getSalary()));
		

	}
	public Salesman() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salesman(int empid, double salary) {
		super(empid, salary);
		// TODO Auto-generated constructor stub
	}
	public Salesman(String name, int empid, double salary) {
		super(name, empid, salary);
		// TODO Auto-generated constructor stub
	}
	public Salesman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Salesman(String name, int empid, double salary, double comm) {
		super(name, empid, salary);
		this.comm = comm;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	
	
	
}
