import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

// Q5. Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time. 
// Do we need to write equals() and hashCode() in Book class? Ans -> No

public class A11_Q5_Main {

	public static void main(String[] args) {
		int choice;
		String isbn;

		Scanner sc = new Scanner(System.in);
		Map<String, Book> map = new HashMap<>();
		map.put("book1", new Book("book1", 100, "ritu", 8));
		map.put("book3", new Book("book3", 400, "isha", 2));
		map.put("book1", new Book("book1", 600, "riya", 8));
		map.put("book4", new Book("book4", 400, "rudra", 8));
		map.put("book5", null);
		map.put("book4", new Book("book5", 400, "zebra", 8));
		map.put("book0", new Book("book0", 300, "ujjwal", 2));

		map.put(null, null);

		do {
			System.out.println("\n---------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add Book");
			System.out.println("2. Search Book");
			System.out.println("3. Display All Books");
			System.out.print("Enter your choice = ");
			choice = sc.nextInt();
			System.out.println("\n---------------------------------------");

			switch (choice) {
			case 1:
				Book b1 = new Book();
				b1.acceptBook();
				map.put(b1.getisbn(), b1);
				System.out.println("\nBook added");
				break;
			case 2:
				System.out.print("\nEnter ISBN to search = ");
				isbn = sc.next();
				Book b2 = map.get(isbn);
				if (b2 != null) {
					System.out.println("\nBook found\n");
					System.out.println(map.get(isbn));
				} else
					System.out.println("\nBook not found");

				break;

			case 3:
				Set<Entry<String, Book>> b = map.entrySet();
				for (Entry<String, Book> entry : b) {
					System.out.println(entry.getKey() + "-->" + entry.getValue());
				}

			default:
				break;
			}
		} while (choice != 0);

	}

}
