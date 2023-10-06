package a1q4_part_b;

public class a1q4_part_b {
	public static void main(String[] args) {
		int line = 5;
		for (int i = 1; i <= line; i++) {
			for (int k = line - 1; k >=i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2*i-1; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = line-1; i >0; i--) {
			for (int k = 1; k <=line-i; k++) {
				System.out.print(" ");
			}
				
			for (int j = 1; j <= i*2-1; j++) {

				System.out.print("*");
			}

			System.out.println();
		}


	}
}
