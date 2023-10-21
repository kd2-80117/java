
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class A13_Q3_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Strings = ");
		try (FileWriter fwr = new FileWriter("file.txt")) {
			try (BufferedWriter bwr = new BufferedWriter(fwr)) {
				for (int i = 1; i <= 4; i++) {
					String line = sc.nextLine();
					bwr.write(line);
					bwr.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
