package a8_q2;

import java.util.Scanner;

public class Date implements Acceptable, Displayable {
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	int day;
	int month;
	int year;

//	public void acceptDate() {
//		System.out.println("Inside Date acceptDate()");
//	}

//	public void displayDate() {
//		System.out.println("Inside Date displayDate()");
//	}

	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Day = ");
		this.day = sc.nextInt();
		System.out.print("Enter Month = ");
		this.month = sc.nextInt();
		System.out.print("Enter Year = ");
		this.year = sc.nextInt();

	}

	@Override
	public void displayData() {
		System.out.println("Date = "+day+month+year);
	}
}
