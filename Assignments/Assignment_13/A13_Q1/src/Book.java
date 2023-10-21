import java.util.Objects;
import java.util.Scanner;

public class Book {
	private String ibsn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {

	}

	public Book(String ibsn, double price, String authorName, int quantity) {

		this.ibsn = ibsn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIbsn() {
		return ibsn;
	}

	public void setIbsn(String ibsn) {
		this.ibsn = ibsn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void acceptBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Details");
		System.out.print("Enter isbn = ");
		this.ibsn = sc.next();
		System.out.print("Enter price = ");
		this.price = sc.nextDouble();
		System.out.print("Enter Author Name = ");
		this.authorName = sc.next();
		System.out.print("Enter quantity = ");
		this.quantity = sc.nextInt();

	}

	@Override
	public String toString() {
		return "Book [ibsn = " + ibsn + ", price = " + price + ", authorName = " + authorName + ", quantity = "
				+ quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, ibsn, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Book other = (Book) obj;
		if (other.getIbsn().equals(this.ibsn))
			return true;
		return false;
	}

}
