import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

// Q5. Store Students in HashMap<> so that for given isbn, Student can be searched in fastest possible time. 
// Do we need to write equals() and hashCode() in Student class? Ans -> No

public class A11_Q6_Main {

	public static void main(String[] args) {
		int choice,rollno;

		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> map = new LinkedHashMap<>();
		
		do {
			System.out.println("\n---------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add Student");
			System.out.println("2. Search Student");
			System.out.println("3. Display All Students");
			System.out.print("Enter your choice = ");
			choice = sc.nextInt();
			System.out.println("\n---------------------------------------");

			switch (choice) {
			case 1:
				Student b1 = new Student();
				b1.accept();
				map.put(b1.getRollno(), b1);
				System.out.println("\nStudent added");
				break;
			case 2:
				System.out.print("\nEnter Roll no to search = ");
				rollno = sc.nextInt();
				Student b2 = map.get(rollno);
				if (b2 != null) {
					System.out.println("\nStudent found\n");
					System.out.println(map.get(rollno));
				} else
					System.out.println("\nStudent not found");

				break;

			case 3:
				Set<Entry<Integer, Student>> b = map.entrySet();
				for (Entry<Integer, Student> entry : b) {
					System.out.println(entry.getKey() + "-->" + entry.getValue());
				}

			default:
				break;
			}
		} while (choice != 0);

	}

}
