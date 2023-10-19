package com.ritu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

// Q2. Store few books in a LinkedHashSet and display them using iterator. 
// If any book with duplicate isbn is added, what will happen? 
// Duplicate values will be added if hashCode() and equals() are not defined in User Defined class
// But if we define hashCode() and equals() then duplicates are not allowed.
// Books are stored in which order? According to insertion order
// Solve duplicate ISBN problem -> to solve duplicate problem we will define hashCode() and equals()

public class A11_Q2_Main {

	public static void main(String[] args) {
		
		LinkedHashSet<Book> bookSet = new LinkedHashSet<Book>();
		bookSet.add(new Book("book1",100,"ritu",8));
		bookSet.add(new Book("book3",400,"isha",2));
		bookSet.add(new Book("book1",600,"riya",8)); //duplicates added as hashcode() in class is not defined
		bookSet.add(new Book("book4",400,"rudra",8));
		bookSet.add(new Book("book2",300,"ujjwal",9));
		bookSet.add(null);
		bookSet.add(null); // only 1 single null is allowed
		
		Iterator<Book> itr = bookSet.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}

	}

}

