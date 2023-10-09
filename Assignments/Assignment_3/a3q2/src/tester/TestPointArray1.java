package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		int arrSize;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many no of points to plot = ");
		arrSize = sc.nextInt();
		Point2D points[] = new Point2D[arrSize];
		int choice = 0, index, startPoint, endPoint;
		
		// Traditional for loop
		for (int i = 0; i < arrSize; i++) {
			points[i] = new Point2D();
		}
//
//		for (int i = 0; i < arrSize; i++) {
//			points[i].acceptCoordinates();
//		}

		// For each loop
//		for(Point2D point2d:points)
//		{
//			Point2D p = new Point2D();  
//		}
//we can't do this as array has null values..we need to initialize using traditional for loop or hard coded.
		
		// For each loop
		for(Point2D point2d:points)
			point2d.acceptCoordinates();
		
		
		do {
			System.out.println("------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Display Details of a specific point");
			System.out.println("2. Display Details of all points");
			System.out.println("3. Display Distance between specified points");
			System.out.println("0. Exit");
			System.out.print("Enter your choice = ");
			choice = sc.nextInt();
			System.out.println("------------------------------------------------");
			switch (choice) {
			case 0:
				break;
			case 1:
				System.out.print("Enter index of specific point = ");
				index = sc.nextInt();
				points[index].getDetails();
				break;
			case 2:
				for (Point2D point2d : points) {
					point2d.getDetails();
				}
				break;
			case 3:
				System.out.print("Enter index of starting point and end point = ");
				startPoint = sc.nextInt();
				endPoint = sc.nextInt();
				if (startPoint < 0 || startPoint > arrSize - 1 || endPoint < 0 || endPoint > arrSize - 1) {
					System.out.println("Entered wrong indexes.");
				} else {
					points[startPoint].calculateDistance(points[startPoint], points[endPoint]);
				}
				break;

			default:
				System.out.println("Entered wrong choice...:(");
				break;
			}
		} while (choice != 0);
		System.out.println("Thank you for using our App...:)");
	}

}
