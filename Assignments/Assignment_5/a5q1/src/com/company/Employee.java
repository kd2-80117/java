package com.company;

import java.util.Scanner;

public abstract class Employee {
	String firstName;
	String lastName;
	int ssn;

	public abstract void totalSalary();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, int ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		this.firstName=sc.next();
		System.out.print("Enter Last Name : ");
		this.lastName=sc.next();
		System.out.print("Enter Social Security Number: ");
		this.ssn=sc.nextInt();
		
	}

	@Override
	public String toString() {
		return "Employee [firstName = " + firstName + ", lastName = " + lastName + ", ssn = " + ssn + "]";
	}

}
