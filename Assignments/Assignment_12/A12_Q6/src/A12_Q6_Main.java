import java.util.Scanner;
import java.util.stream.Stream;

public class A12_Q6_Main {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter number = ");
		num = new Scanner(System.in).nextInt();

		Stream<Integer> strm = Stream.iterate(1, x -> ++x).limit(num); // only ++x can be used not x++ as it is post
																		// increment & it will give value first then it
																		// will increment

		// Stream<Integer> strm = Stream.iterate(1, x -> x+1).limit(num); //other way of doing it
		System.out.println("Factorial of given num = " + strm.reduce(1, (a, e) -> a * e));

	}

}
