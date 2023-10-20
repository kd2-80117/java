import java.util.stream.IntStream;

public class A12_Q8_Main {

	public static void main(String[] args) {
		
		IntStream strm1 = IntStream.range(1,10);
		System.out.println("Sum of 1 to 9 numbers = "+strm1.sum());
		
		
		IntStream strm2 = IntStream.range(1,10);
		System.out.println(strm2.summaryStatistics());

	}

}
