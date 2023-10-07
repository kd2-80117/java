package employee.test;

import employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.acceptEmployee();
		emp.displayEmployee();
		emp.raiseSalary(10);
		emp.displayEmployee();

	}

}
