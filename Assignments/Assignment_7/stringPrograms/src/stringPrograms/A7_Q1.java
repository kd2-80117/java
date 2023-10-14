package stringPrograms;

import java.util.Arrays;

public class A7_Q1 {
	public static void main(String[] args) {
		String arr1[] = { "This","is" , "ritu", "powar" };
		String arr2[] = { "ritu", "is", "smart" };
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		for (String string : arr1) {
			for (String string2 : arr2) {
				if (string.equals(string2))
					System.out.println("Duplicate values are = " + string);
			}
		}
		
	}

}