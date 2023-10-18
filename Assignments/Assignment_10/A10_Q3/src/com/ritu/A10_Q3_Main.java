/**
 * @author ritupowar
 *
 */
package com.ritu;

import java.util.*;

public class A10_Q3_Main {

	@SuppressWarnings("resource")
	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Find Employee");
		System.out.println("4. Sort Employees");
		System.out.println("5. Edit Employees");
		System.out.println("6. Display Employees List");
		System.out.print("Enter your choice = ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");

		return choice;
	}

	public static void main(String[] args) {

		int choice, index, count = 0;
		Employee key;
		int empno;
		Scanner sc = new Scanner(System.in);
		List<Employee> employeeList = new LinkedList<Employee>();
		Employee b;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				b = new Employee();
				b.acceptEmployee(sc);
				employeeList.add(b);
				break;
				
			case 2:
				System.out.print("Enter Empno for deleting Employee = ");
				empno = sc.nextInt();
				key = new Employee();
				key.setEmpno(empno);
				index = employeeList.indexOf(key);
				employeeList.remove(index);
				System.out.println("Employee with Empno = " + empno + " deleted from " + index + " index");
				break;

			case 3:
				System.out.print("Enter Empno for searching = ");
				empno = sc.nextInt();
				key = new Employee();
				key.setEmpno(empno);
				index = employeeList.indexOf(key);
				if (index == -1)
					System.out.println("Employee not found :(");
				else {
					System.out.println("Employee found at " + index + " index");
					System.out.println(employeeList.get(index));
				}

				break;
			case 4:
				class EmployeeComparator implements Comparator <Employee>{
					@Override
					public int compare(Employee e1, Employee e2) {
						int diff = e1.getEmpno()-e2.getEmpno();
						return diff;
					}
				}
				employeeList.sort(new EmployeeComparator());
				System.out.println("Sorted Employee List : ");
				for (Employee employee : employeeList) {
					System.out.println(employee);
				}
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				key = new Employee();
				key.setEmpno(id);
				index = employeeList.indexOf(key);
				if (index == -1)
					System.out.println("Employee not found.");
				else {
					Employee oldEmp = employeeList.get(index);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.acceptEmployee(sc);
					employeeList.set(index, newEmp);
				}
				break;
			case 6:
				for (int i = 0; i < employeeList.size(); i++) {
					System.out.println(employeeList.get(i));

				}
				break;
			

			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our HR App :)");
	}
}
