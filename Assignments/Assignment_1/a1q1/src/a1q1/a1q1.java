package a1q1;
import java.util.*;


public class a1q1 {
	
	public static void main(String[] args) {
		int num;	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		num = sc.nextInt();
		System.out.println("Given Number: "+num);
		System.out.println("Binary Equivalent: "+ Integer.toBinaryString(num));
		System.out.println("Octal Equivalent: "+ Integer.toOctalString(num));
		System.out.println("Hexadecimal Equivalent: "+ Integer.toHexString(num));
	}

}
