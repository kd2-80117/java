package a8_q1;

import java.util.Date;

public class Box<t extends Employee> {
	private t data;


	public void calculateSalary() {
		System.out.println("Total salary = "+getData().getSalary());

	}

	public Box(t data) {
		super();
		this.data = data;
	}

	public Box() {
		super();
	}

	public t getData() {
		return data;
	}

	public void setData(t data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Box<Employee> e =new Box<>();
		e.setData(new Manager());
		e.getData().accept();
		e.getData().calculateSalary();
	}

}

/*
 * Extra Practice
 * 
 * public class Box<t> {
	private t data;

	public Box(t data) {
		super();
		this.data = data;
	}

	public Box() {
		super();
	}

	public t getData() {
		return data;
	}

	public void setData(t data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		b1.setData(new String("Ritu"));
		System.out.println(b1.getData());

		Box<Date> b2 = new Box<>();
		b2.setData(new Date());
		System.out.println(b2.getData());

		Box<Manager> m = new Box<>();
		m.setData(new Manager());
		m.getData().accept();
		m.getData().calculateSalary();
		
		Box <Employee> e = new Box<Employee>();
		e.setData(new Salesman());
		e.getData().accept();
		e.getData().calculateSalary();
		
	}

}*/
