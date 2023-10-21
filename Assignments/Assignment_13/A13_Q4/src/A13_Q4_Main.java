
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class A13_Q4_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (FileReader frd = new FileReader("file.txt")) {
			try (BufferedReader brd = new BufferedReader(frd)) {
				
				while (true) {
					String line = brd.readLine();
					if(line!=null)
					System.out.println(line);
				}
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
