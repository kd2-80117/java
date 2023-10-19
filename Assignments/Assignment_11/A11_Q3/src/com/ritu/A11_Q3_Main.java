package com.ritu;
import java.util.Iterator;
import java.util.TreeSet;

// Q3. In above assignment use TreeSet instead of LinkedHashSet. 
//     Use natural ordering for the Book. 
//     If any book with duplicate isbn is added, what will happen?
//     No duplicates are not added
//     Books are stored in which order?
//     In TreeSet Books are stored in natural Ordering		
		
public class A11_Q3_Main {

	public static void main(String[] args) {
		
		TreeSet<Book> bookSet = new TreeSet<Book>();
		bookSet.add(new Book("book1",100,"ritu",8));
		bookSet.add(new Book("book3",400,"isha",2));
		bookSet.add(new Book("book1",600,"riya",8)); 
		bookSet.add(new Book("book4",400,"rudra",8));
		bookSet.add(new Book("book2",300,"ujjwal",9));
	
		
		Iterator<Book> itr = bookSet.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}

	}

}

