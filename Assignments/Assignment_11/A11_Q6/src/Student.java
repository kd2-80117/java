import java.util.Scanner;

public class Student {
private int rollno;
private String name;
private double marks;
public Student() {
	
}
public Student(int rollno, String name, double marks) {
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}

public void accept() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Roll no = ");
	rollno = sc.nextInt();
	System.out.print("Enter Name = ");
	name = sc.next();
	System.out.print("Enter Marks = ");
	marks = sc.nextDouble();
}

}
