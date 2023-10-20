import java.util.List;

public interface Emp {
	abstract double getSal();

	default double calcIncentives() {
		return 0;
	}
	static double calcTotalIncome(List<Emp> arr) {
		double totalIncome=0;
		for (Emp emp : arr) {
		totalIncome += emp.getSal()+emp.calcIncentives();
		}
		return totalIncome;
	}
}

class Manager implements Emp {
	private double basicSalary;
	private double dearanceAllowance;

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		return this.basicSalary + this.dearanceAllowance;
	}

	@Override
	public double calcIncentives() {
		return 0.2 * basicSalary;
	}
}

class Labour implements Emp {
	private int hours;
	private double rate;

	public Labour(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return this.hours * this.rate;
	}
	
	@Override
	public double calcIncentives() {
		if(hours>300) {
			return 0.05 * (this.hours * this.rate);
		}else return 0;
	}

}

class Clerk implements Emp{
	private double salary;

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public double getSal() {
	
		return this.salary;
	}
	
	
}
