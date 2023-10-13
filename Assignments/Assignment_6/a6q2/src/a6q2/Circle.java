package a6q2;

import java.util.Scanner;

public class Circle {
	Point2D centerPoint = new Point2D();
	double diameter;
	public Circle() {
		super();
		this.diameter=100;
	}

	
	public void accept() {
		
	System.out.print("Enter diameter = ");
	
	this.diameter= new Scanner(System.in).nextDouble();
	if(this.diameter<0) throw new NegativeDiameterException("Diameter cannot be negative");
	System.out.println("Enter Coordinates for Center Point");
	centerPoint.acceptCoordinates();
	
	}
	
	public Point2D getCenterPoint() {
		return centerPoint;
	}
	public void setCenterPoint(Point2D centerPoint) {
		this.centerPoint = centerPoint;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		if(diameter<0) throw new NegativeDiameterException();
		this.diameter = diameter;
	}
	@Override
	public String toString() {
		return "Circle [centerPoint = " + centerPoint.getDetails() + ", diameter = " + diameter + "]";
	}
}

