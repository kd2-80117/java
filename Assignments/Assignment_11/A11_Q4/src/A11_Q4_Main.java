import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// Q4. Use TreeSet to store all books in descending order of price. 
//	   Natural ordering for the Book should be isbn (do not change it). 
//	   Display them using iterator() and descendingIterator().	
		
public class A11_Q4_Main {

	public static void main(String[] args) {
		
		class bookPriceComparator implements Comparator<Book>{

			@Override
			public int compare(Book b1, Book b2) {
			int diff = -(int)(b1.getPrice()-b2.getPrice());
				return diff;
			}
			
		}
		
		
		TreeSet<Book> bookSet = new TreeSet<Book>(new bookPriceComparator());
		bookSet.add(new Book("book1",100,"ritu",8));
		bookSet.add(new Book("book3",400,"isha",2));
		bookSet.add(new Book("book1",600,"riya",8)); 
		bookSet.add(new Book("book4",400,"rudra",8));
		bookSet.add(new Book("book2",300,"ujjwal",9));
	
		System.out.println("Books using iterator");
		Iterator<Book> itr = bookSet.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
		System.out.println("----------------------------------");
		System.out.println("Books using descendingIterator()");
		itr = bookSet.descendingIterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
		
	}

}


