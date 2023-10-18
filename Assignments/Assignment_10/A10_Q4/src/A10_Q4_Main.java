import java.util.*;

//In which collection classes null is not allowed? 
//Duplicate null is not allowed? Multiple nulls are allowed?

public class A10_Q4_Main {

	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>();
		//Collection<String> c = new HashSet<>();
		//Collection<String> c = new LinkedHashSet<>();
		Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add("C");
		//c.add(null);
		//c.add(null);
		//c.add(null);
		System.out.println(c.toString());

	}

}
