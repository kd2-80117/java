package tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.acceptCoordinates();
		p1.getDetails();
		Point2D p2 = new Point2D();
		p2.acceptCoordinates();
		p2.getDetails();
		p2.calculateDistance(p1, p2);
		p1.isEqual(p1, p2);
		
	}

}
