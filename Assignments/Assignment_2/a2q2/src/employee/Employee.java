package employee;

import java.util.Scanner;

public class Employee {
	String firstName;
	String LastName;
	double monthlySalary;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		if (this.monthlySalary >= 0) {
			this.monthlySalary = monthlySalary;
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary >= 0) {
			this.monthlySalary = monthlySalary;
		}
	}

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name = ");
		firstName = sc.next();
		System.out.print("Enter Last Name = ");
		LastName = sc.next();
		System.out.print("Enter Monthly Salary = ");
		if (monthlySalary >= 0)
			monthlySalary = sc.nextDouble();
	}
	public void displayEmployee() {
		System.out.println("------------------------------");
		System.out.println("Employees's Details");
		System.out.println("First Name = "+firstName);
		System.out.println("Last Name = "+LastName);
		System.out.println("Monthly Salary = "+monthlySalary);
		System.out.println("Yearly Salary = "+monthlySalary*12);
		System.out.println("------------------------------");
	}
	public void raiseSalary(double raisePercentage) {
		
		double raiseSal = raisePercentage/100 * getMonthlySalary()+ getMonthlySalary();
		System.out.println("raise = "+raiseSal);
		setMonthlySalary(raiseSal);
	}

}
