package a6q1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String string;
		Scanner sc = new Scanner(System.in);
		ExceptionLineTooLong e = new ExceptionLineTooLong();
		System.out.print("Enter String = ");
		
		try {
			string = sc.next();
			e.setString(string);
			System.out.println(e);
		}catch(ExceptionLineTooLong e1) {
			e1.printStackTrace();
		}finally {
			sc.close();
		}
		

		
		
		

	}
}
