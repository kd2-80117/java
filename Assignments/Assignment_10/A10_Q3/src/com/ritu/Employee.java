package com.ritu;

import java.util.*;

public class Employee {
	private int empno;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(int empno, String name, double salary) {

		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empno == other.empno;
	}

	void acceptEmployee(Scanner sc) {
		System.out.print("Enter Emp no = ");
		this.empno = sc.nextInt();
		sc.nextLine(); // skips \n in input buffer
		System.out.print("Enter Name = ");
		this.name = sc.nextLine();
		System.out.print("Enter Salary = ");
		this.salary = sc.nextDouble();
	}
}
