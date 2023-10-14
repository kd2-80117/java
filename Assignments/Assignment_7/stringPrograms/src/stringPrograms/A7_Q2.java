package stringPrograms;

import java.util.Scanner;

public class A7_Q2 {

	public static String isReverse(String string) {
		
		String res="";
		for (int i =string.length()-1; i >=0; i--) {
			
				res+=string.charAt(i);
				
				}
		return res;
		}

	public static void main(String[] args) {
		System.out.print("Enter String = ");
		String string = new Scanner(System.in).next();
		System.out.println("Reverse String = "+isReverse(string));
		System.out.print("Enter String = ");
		String string1 = new Scanner(System.in).next();
		StringBuffer s1 = new StringBuffer(string1);
		s1.reverse();
		System.out.println("Reverse String = "+s1);
	}

}
