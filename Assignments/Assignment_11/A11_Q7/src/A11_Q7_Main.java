import java.util.ArrayList;
import java.util.List;

public class A11_Q7_Main {

	public static void main(String[] args) {
		
		List<Emp> empArr = new ArrayList<Emp>();
		empArr.add(new Manager(500, 5));
		empArr.add(new Labour(250, 50));
		empArr.add(new Clerk(100));
		
		
		System.out.println("Total Salary of all Employees = "+Emp.calcTotalIncome(empArr));

	}

}
