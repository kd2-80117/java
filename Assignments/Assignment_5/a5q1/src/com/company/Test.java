package com.company;

public class Test {

	public static void main(String[] args) {
//		Employee emp = new SalariedEmployee();
//		emp.accept();
//		System.out.println(emp);
//		emp.totalSalary();
//		Employee emp = new CommissionEmployee();
//		emp.accept();
//		System.out.println(emp);
//		emp.totalSalary();
//		Employee emp = new HourlyEmployee();
//		emp.accept();
//		System.out.println(emp);
//		emp.totalSalary();
		Employee emp = new BasePlusCommissionEmployee();
		emp.accept();
		System.out.println(emp);
		emp.totalSalary();
		BasePlusCommissionEmployee b = (BasePlusCommissionEmployee) emp;
		b.increment(10);
		System.out.println(b);
	}

}
