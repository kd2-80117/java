import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A10_Q2_Main {

	public static void main(String[] args) {
		
		class StringLengthComparator implements Comparator<String>{

			@Override
			public int compare(String s1, String s2) {
				int diff = s1.length()-s2.length();
				return diff;
			}
			
		}
		
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hi");
		stringList.add("this");
		stringList.add("is");
		stringList.add("Ritu");
		stringList.add("Ritu Powar");
		System.out.println("String with highest length = "+Collections.max(stringList,new StringLengthComparator()));

	}

}
