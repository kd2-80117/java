package tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("0.Exit");
		System.out.println("1. Add Mango to Cart");
		System.out.println("2. Add Orange to Cart");
		System.out.println("3. Add Apple to Cart");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name,color,weight,taste of all fresh fuits in the basket");
		System.out.println("6. Display tastes of all stale fruits in the basket ");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		System.out.println("-----------------------------------------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		int basketSize, choice, staleIndex;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fruit basket size: ");
		basketSize = sc.nextInt();
		Fruit basket[] = new Fruit[basketSize];
		int index = 0;
		while ((choice = menu()) != 0) {

			switch (choice) {
			case 0:

				break;
			case 1: {
				basket[index] = new Mango();
				basket[index].acceptFruit();
				index++;
			}
				break;
			case 2: {
				basket[index] = new Orange();
				basket[index].acceptFruit();
				index++;
			}
				break;
			case 3: {
				basket[index] = new Apple();
				basket[index].acceptFruit();
				index++;
			}
				break;
			case 4:
				if (index < 0) {
					System.out.println("Fruit Basket is empty");
					break;
				}
				for (Fruit fruit : basket) {
					if (fruit != null)
						System.out.println(fruit.getName());
				}
				break;
			case 5:
				if (index < 0) {
					System.out.println("Fruit Basket is empty");
					break;
				}
				for (Fruit fruit : basket) {
					if (fruit != null) {
						System.out.println(fruit.toString());
							
					}
				}

				break;
			case 6:

				for (Fruit fruit : basket) {
					if (fruit != null) {
						if (!fruit.isFresh())
							System.out.println(fruit.taste());
					}
				}
				break;
			case 7:
				System.out.println("Enter index to mark stale fruit: ");
				staleIndex = sc.nextInt();
				if (staleIndex < 0 && staleIndex > index) {
					System.out.println("Wrong Index entered..:(");
					break;
				} else {
					basket[staleIndex].setFresh(false);
					System.out.println("Fruit marked as stale");
					break;
				}

			case 8:
				for (Fruit fruit : basket) {
					if (fruit != null) {
						if (fruit.taste() == "sour") {
							fruit.setFresh(false);
						}
					}
				}

				break;
			default:
				break;
			}
		}

	}

}
