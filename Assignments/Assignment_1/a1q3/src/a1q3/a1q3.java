package a1q3;

import java.util.*;

public class a1q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		int qty;
		System.out.println("****** FOOD MENU ******");
		System.out.println("Dishes     		Prices");
		System.out.println("1. Dosa    		₹100");
		System.out.println("2. Pizza  		₹500");
		System.out.println("3. Idli		    	₹50");
		System.out.println("4. Pav Bhaji    	₹150");
		System.out.println("5. Burger       	₹200");
		System.out.print("Choose food and quantity: ");
		choice = sc.nextLine();
		qty = sc.nextInt();
		switch (choice) {
		case "Dosa":
			System.out.println("Generated Bill is ₹ " + qty * 100);
			break;
		case "Pizza":
			System.out.println("Generated Bill is ₹ " + qty * 500);
			break;
		case "Idli":
			System.out.println("Generated Bill is ₹ " + qty * 50);
			break;
		case "Pav Bhaji":
			System.out.println("Generated Bill is ₹ " + qty * 150);
			break;
		case "Burger":
			System.out.println("Generated Bill is ₹ " + qty * 200);
			break;
		default:
			System.out.println("Wrong choice entered..:(");
			break;

		}

	}

}
