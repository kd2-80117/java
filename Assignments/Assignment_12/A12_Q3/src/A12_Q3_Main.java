import java.util.Scanner;

public class A12_Q3_Main {

	@FunctionalInterface
	public interface Arithmetic {
		abstract double calc(double d1, double d2);
	}

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 & num2 = ");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		do {
			System.out.println("--------------------------");
			System.out.println("Menu ");
			System.out.println("0. Exit\n1. Add \n2. Subtract \n3. Multiply \n4. Divide");
			System.out.print("Enter your Choice = ");
			choice = sc.nextInt();
			System.out.println("--------------------------");
			switch (choice) {
			case 0: break;
			case 1:
				calculate(num1, num2, (a,b) -> a+b );
					
				break;
			case 2:
				calculate(num1, num2, (a,b) -> a-b );
				break;
			case 3:
				calculate(num1, num2, (a,b) -> a*b );
				break;
			case 4:
				calculate(num1, num2, (a,b) -> a/b );
				break;

			default:
				System.out.println("Wrong choice entered...:(");
				break;
			}
		} while (choice != 0);
		System.out.println("Thank you for using our App...:)");
	}

}
