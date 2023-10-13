package a6q2;

import java.lang.*;
import java.util.Scanner;

public class Point2D {
	float x_axis;
	float y_axis;

	public Point2D() {

	}

	public Point2D(float x_axis, float y_axis) {
		super();
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}

	public float getX_axis() {
		return x_axis;
	}

	public void setX_axis(float x_axis) {
		this.x_axis = x_axis;
	}

	public float getY_axis() {
		return y_axis;
	}

	public void setY_axis(float y_axis) {
		this.y_axis = y_axis;
	}

	public void acceptCoordinates() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X-coordinates = ");
		setX_axis(sc.nextFloat());
		System.out.print("Enter Y-coordinates = ");
		setY_axis(sc.nextFloat());

	}

	public String getDetails() {
		String result = "Point(x , y) = (" + x_axis + " , " + y_axis + ")";
		System.out.println(result);
		return result;
	}

	public Boolean isEqual(Point2D p1, Point2D p2) {
		if (p1.getX_axis() == p2.getX_axis() && p1.getY_axis() == p2.getY_axis()) {
			System.out.println("Both points are equal.");
			return true;
		} else
			return false;
	}
	
	public void calculateDistance(Point2D p1, Point2D p2) {
		if(isEqual(p1,p2)) {
			System.out.println("Distance cannot be calculated...as points are equal.");
		}else {
		double result = Math.sqrt(Math.pow((p2.getX_axis() - p1.getX_axis()),2)+Math.pow((p2.getY_axis() - p1.getY_axis()),2));
		System.out.println("Distance between 2 points = "+result);
		}
	}
}