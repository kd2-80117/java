import java.util.Arrays;
import java.util.Comparator;

public class A9_Q3_Main {
	
	public static void main(String[] args) {
		
		class StudentComparator implements Comparator<Student> {

			@Override
			public int compare(Student s1, Student s2) {
				int diff = -s1.getCity().compareTo(s2.getCity());
				if (diff == 0)
					diff = -(int) (s1.getMarks() - s2.getMarks());
				if (diff == 0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}

		}
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "om", "pune", 34);
		arr[1] = new Student(2, "ram", "pune", 34);
		arr[2] = new Student(3, "shyam", "mumbai", 23.2);
		arr[3] = new Student(4, "riya", "thane", 54.5);
		arr[4] = new Student(5, "isha", "pune", 80);

		System.out.println("\nBefore Sort\n");
		for (Student student : arr) {
			System.out.println(student);
		}

		StudentComparator comparator = new StudentComparator();
		Arrays.sort(arr, comparator);
		System.out.println("\nAfter comparator Sort\n");
		for (Student student : arr) {
			System.out.println(student);
		}
	}
}
