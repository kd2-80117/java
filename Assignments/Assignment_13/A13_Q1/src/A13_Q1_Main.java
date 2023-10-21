
/**
 * @author ritupowar
 *
 */

import java.util.ArrayList;
import java.io.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.util.Scanner;

public class A13_Q1_Main {

	@SuppressWarnings("resource")
	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list");
		System.out.println("7. Save books in file");
		System.out.println("8. Load books from file");

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

				if (bookList.contains(b)) {
					index = bookList.indexOf(b);
					int qty = b.getQuantity() + bookList.get(index).getQuantity();
					bookList.get(index).setQuantity(qty);

				} else {
					bookList.add(b);
				}

				break;

			case 2:
				for (int i = 0; i < bookList.size(); i++) {
					System.out.println(bookList.get(i));

				}
				break;

			case 3:
				System.out.print("Enter isbn for searching = ");
				isbn = sc.next();
				key = new Book();
				key.setIbsn(isbn);
				index = bookList.indexOf(key);
				if (index == -1)
					System.out.println("Book not found :(");
				else {
					System.out.println("Book found at " + index + " index");
					System.out.println(bookList.get(index));
				}

				break;

			case 4:
				System.out.print("Enter index for deletion of book = ");
				index = sc.nextInt();
				if (index < 0 && index > bookList.size()) {
					System.out.println("Wrong Index...:(");

				} else {
					bookList.remove(index);
					System.out.println("Book at given " + index + " index deleted");

				}
				break;

			case 5:
				System.out.print("Enter isbn for deleting book = ");
				isbn = sc.next();
				key = new Book();
				key.setIbsn(isbn);
				index = bookList.indexOf(key);
				bookList.remove(index);
				System.out.println("Book with ibsn = " + isbn + " deleted from" + index + " index");
				break;

			case 6:
				System.out.println("Reverse Book list : ");
				Collections.reverse(bookList);
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
			case 7:
				try (FileOutputStream fout = new FileOutputStream("bookFile")) {
					try (DataOutputStream dout = new DataOutputStream(fout)) {
						for (Book book : bookList) {
							dout.writeUTF(book.getIbsn());
							dout.writeDouble(book.getPrice());
							dout.writeUTF(book.getAuthorName());
							dout.writeInt(book.getQuantity());
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Books Saved in File");
				break;
				
			case 8:
				System.out.println("Books loaded from File");
				try (FileInputStream fin = new FileInputStream("bookFile")) {
					try (DataInputStream din = new DataInputStream(fin)) {
						while (true) {
							Book book = new Book();
							book.setIbsn(din.readUTF());
							book.setPrice(din.readDouble());
							book.setAuthorName(din.readUTF());
							book.setQuantity(din.readInt());
							System.out.println(book.toString());
						}
					}

				}catch (EOFException e) {
					
				}
				catch (Exception e) {
					e.printStackTrace();
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
