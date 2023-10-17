import java.util.Arrays;

public class A9_Q1 {
	
static <T extends Number> T findMin(T [] arr) {
		T min = arr[0];
		for (T ele : arr) {
			if(ele.doubleValue()<min.doubleValue()) min=ele;
		}
		return min;
		
	}
	
	/*
	 * static <T extends Number> T findMin(T [] arr) {
	 * 
	 * Arrays.sort(arr); return arr[0];
	 * 
	 * }
	 */

public static void main(String[] args) {
	
	Integer [] arr1 = {1,6,4,89,2};
	Integer min1 = findMin(arr1);
	System.out.println("Min in Integer array = "+min1);
	
	Double [] arr2 = {3.4,7.9,97.5,2.4,1.1};
	Double min2 = findMin(arr2);
	System.out.println("Min in Double array = "+min2);
	
//  Below will give compilation error as method only extends Number
//	String [] arr3 = {"hi","one"};
//	String min3 = findMin(arr3);
	}
}
