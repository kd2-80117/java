import java.util.Scanner;

public class A12_Q5_Main {
	@FunctionalInterface
	interface Check<T> {
		
		abstract boolean compare(T x, T y);
	}
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		
		int count=0;
		for (T ele : arr) {
			if(c.compare(ele, key))
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
	
		Double key1;
		Double [] arr1 = {2.4,4.0,1.3,4.0,1.3,0.0,22.22,1.3};
		
		System.out.print("Enter double number = ");
		key1 = new Scanner(System.in).nextDouble();
		
		int cnt1 = countIf(arr1, key1, (x,y) -> x.equals(y));
		System.out.println("Double Count = "+cnt1);
		
		//another method
		
		int cnt3 = countIf(arr1, key1, (x,y) -> x-y==0);
		System.out.println("Double Count = "+cnt3);
		
		
		
	}

}

