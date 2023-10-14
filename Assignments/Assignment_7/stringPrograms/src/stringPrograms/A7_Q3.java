package stringPrograms;

import java.util.Scanner;

public class A7_Q3 {

	public static boolean isPalindrome(String string) {
		for (int i = 0,j=string.length()-1; i < string.length(); i++,j--) {
			
				if (string.charAt(i) != string.charAt(j)) {
					return false;
				}
	
			
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.print("Enter String = ");
		String string = new Scanner(System.in).next();
		A7_Q2 a;
		
		boolean result = isPalindrome(string);
		if(result) {
			System.out.println("String "+string+" is a Palindrome.");
		}else System.out.println("String "+string+" is not a Palindrome.");
	}

}