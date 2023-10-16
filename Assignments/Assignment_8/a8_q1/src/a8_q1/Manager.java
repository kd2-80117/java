package a8_q1;

import java.util.Scanner;

public class Manager extends Employee{
private double bonus;

@Override
public void accept() {
	
	super.accept();
	System.out.print("Enter Bonus = ");
	this.bonus = new Scanner(System.in).nextDouble();
}


@Override
public String toString() {
	return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
}


@Override
public void calculateSalary() {
	System.out.println("Total salary = "+(bonus+getSalary()));
	

}

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}

public Manager(int empid, double salary) {
	super(empid, salary);
	// TODO Auto-generated constructor stub
}

public Manager(String name, int empid, double salary) {
	super(name, empid, salary);
	// TODO Auto-generated constructor stub
}

public Manager(String name, int empid, double salary, double bonus) {
	super(name, empid, salary);
	this.bonus = bonus;
}

public Manager(String name) {
	super(name);
	// TODO Auto-generated constructor stub
}

}
