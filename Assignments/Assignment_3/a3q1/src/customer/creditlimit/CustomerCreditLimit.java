package customer.creditlimit;
import java.util.Scanner;

public class CustomerCreditLimit {
	int accountNo;
	int totalItemsCharged;
	int totalCreditApplied;
	int allowedCreditLimit;
	int balance;

	public CustomerCreditLimit() {
		// TODO Auto-generated constructor stub
	}

	public void accept() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account no = ");
		this.accountNo= sc.nextInt();
		System.out.print("Enter Balance at beginning of the month = ");
		this.balance= sc.nextInt();
		System.out.print("Enter Total Items Charged = ");
		this.totalItemsCharged =sc.nextInt();
		System.out.print("Enter allowed credit limit = ");
		this.allowedCreditLimit= sc.nextInt();
		System.out.print("Enter total credit applied = ");
		this.totalCreditApplied= sc.nextInt();

	}

	public void display() {
		System.out.println("Account No = " + accountNo);
		System.out.println("Balance = " + balance);
		System.out.println("Total Items Charged = " + totalItemsCharged);
		System.out.println("Allowed credit limit = " + allowedCreditLimit);
		System.out.println("Total credit applied = " + totalCreditApplied);
	}

	public void newBalance() {
		balance = balance + totalItemsCharged - totalCreditApplied;
		System.out.println("New Balance = "+balance);
	}

	private void checkCreditLimit() {
		// TODO Auto-generated method stub
		if (balance > allowedCreditLimit)
			System.out.println("Credit Limit Exceeded");

	}
	public static void main(String[] args) {
		CustomerCreditLimit c = new CustomerCreditLimit();
		c.accept();
		c.display();
		c.newBalance();
		c.checkCreditLimit();
		
	}
}


