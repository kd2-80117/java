package a3q3;

public class DrivingCost {
private int totalMilesPerDay;
private int costPerGallon;
private int avgMiles;
private int parkingFeesPerDay;
private int tollsPerDay;

public DrivingCost() {
	
}

public DrivingCost(int totalMilesPerDay, int costPerGallon, int avgMiles, int parkingFeesPerDay, int tollsPerDay) {
	super();
	this.totalMilesPerDay = totalMilesPerDay;
	this.costPerGallon = costPerGallon;
	this.avgMiles = avgMiles;
	this.parkingFeesPerDay = parkingFeesPerDay;
	this.tollsPerDay = tollsPerDay;
}

public void calculateDrivingCost() {
	float drivingCost = totalMilesPerDay/avgMiles * costPerGallon +parkingFeesPerDay +tollsPerDay;
	System.out.println("Driving Cost = "+drivingCost);
}
	public static void main(String[] args) {
	DrivingCost d = new DrivingCost(15,90,8,100,150);
	d.calculateDrivingCost();

	}

}
