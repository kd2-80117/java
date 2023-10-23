import java.util.Scanner;

public class Practice2_Main {
	public static int menu(Scanner sc) {
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add a new bug -- with current system time");
		System.out.println("2. Update given bug status to 'closed'");
		System.out.println("3. Display all open bugs in ascending order of created date along with developer name");
		System.out.println("4. Display report indicating count of open bugs for each member (including member name)");
		System.out.println("5. Assign bug to given developer -- also change modified time to the current system time");
		System.out.println("6. Display all Members");
		System.out.print("Enter your choice = ");
		int choice = sc.nextInt();
		System.out.println("------------------------------------------------------");
		return choice;

	}

	public static void main(String[] args) {
		int choice;
		Bug b;
		Scanner sc = new Scanner(System.in);
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				b = new Bug();
				System.out.println("Enter Bug Details");
				System.out.print("Enter Title = ");
				b.setTitle(sc.next());
				System.out.print("Enter Description = ");
				b.setDescription(sc.next());
				System.out.print("Enter Assigned to = ");
				b.setAssigned_to(sc.nextInt());
				
				try(BugDao bdao = new BugDao()){
					System.out.println(bdao.addBug(b)+" Bug Added...");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;

			default:
				break;
			}
		}

	}

}
