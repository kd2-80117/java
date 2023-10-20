import java.util.Random;
import java.util.stream.Stream;

public class A12_Q7_Main {

	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100)).limit(10);
		
		System.out.println("Sum of 10 random integers = "+strm.reduce(0,(a,e)->a+e));

	}

}
