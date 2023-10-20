import java.util.function.Predicate;

public class A12_Q2_Main {

	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant","Ritu Powar" };
		// call countIf() to count number of strings have length more than 6 -- using
		// anonymous inner class
		int cnt = countIf(arr, new Predicate<String>() {
			public boolean test(String s) {
				return s.length() > 6;
			}
		});
		System.out.println("Result: " + cnt); // 2
		// call countIf() to count number of strings have length more than 6 -- using
		// lambda expressions
		System.out.println("\nAfter Lambda Expressions\n");
		int cnt1 = countIf(arr, s -> s.length() > 6);
		System.out.println("Result: " + cnt1); // 2

	}

}
