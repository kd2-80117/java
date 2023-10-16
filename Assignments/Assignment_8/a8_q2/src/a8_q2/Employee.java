package a8_q2;

import java.util.Scanner;

public class Employee implements Acceptable,Displayable{
	int empid;
	String name;
	double salary;
	
//	public void acceptEmployee() {
//		System.out.println("Inside Employee acceptEmployee()");
//	}
	
//	public void printEmployee() {
//		System.out.println("Inside Employee printEmployee()");	
//	}
	
	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Empid = ");
		this.empid=sc.nextInt();
		System.out.print("Enter Name = ");
		this.name=sc.next();
		System.out.print("Enter Salary = ");
		this.salary=sc.nextDouble();
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public void displayData() {
		System.out.println("Empid = "+empid);	
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
}
