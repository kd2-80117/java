import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class A9_Q4_Main {

	@SuppressWarnings("resource")
	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Delete book at given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.print("Enter your choice = ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");

		return choice;
	}

	public static void main(String[] args) {

		int choice, index, count = 0;
		Book key;
		String isbn;
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<Book>();
		Book b;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				b = new Book();
				b.acceptBook();
				bookList.add(b);
				break;
			case 2:
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
			case 3:
				System.out.println("Enter index for deletion of book = ");
				index = sc.nextInt();
				if (index < 0 && index > bookList.size()) {
					System.out.println("Wrong Index...:(");
					break;
				} else {
					bookList.remove(index);
					System.out.println("Book at given index deleted");
					break;
				}
				
			case 4:
				System.out.println("Enter isbn for searching = ");
				isbn = sc.next();
				key = new Book();
				key.setIbsn(isbn);
				System.out.println(bookList.contains(key));
				break;
			case 5:
				bookList.clear();
				System.out.println("All books in list are deleted.");
				break;
			case 6:

				for (Book book : bookList) {
					count += book.getQuantity();
				}
				System.out.println("Number of books in list = " + count);
				break;
			case 7:
				class Arrsort implements Comparator<Book> {
					@Override
					public int compare(Book a, Book b) {
						int diff = -Double.compare(a.getPrice(), b.getPrice());

						return diff;
					}
				}

				Arrsort booksort = new Arrsort();
				bookList.sort(booksort);
				System.out.println("Sorted Book List");
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our Book App :)");
	}
}
