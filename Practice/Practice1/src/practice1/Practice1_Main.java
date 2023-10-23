package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Practice1_Main {
	public static int menu(Scanner sc) {
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add Project");
		System.out.println("2. Display all Projects");
		System.out.println("3. Delete a Project");
		System.out.println("4. Copy All Projects from Set to ArrayList");
		System.out.println("5. Display all Projects from List");
		System.out.println("6. Sort all Projects in List by Start Date and Display");
		System.out.println("7. Find project with Max team size using Collections.max()");
		System.out.println("8. Count all Projects of \"Java\" technology using Stream API");
		System.out.print("Enter your choice = ");
		int choice = sc.nextInt();
		System.out.println("------------------------------------------------------");
		return choice;

	}


	public static void main(String[] args) {
		int choice;
		HashSet<Project> projectSet = new HashSet<Project>();
		ArrayList<Project> projectArr = new ArrayList<Project>();
		Scanner sc = new Scanner(System.in);
		projectSet.add(new Project(1, "Train Reservation System", 4, Util.toDate("2023-02-22"), "Java"));
		projectSet.add(new Project(2, "Airline Reservation System", 3, Util.toDate("2023-03-21"), ".NET"));
		projectSet.add(new Project(4, "Online Grocery Shop", 6, Util.toDate("2023-04-12"), "Java"));
		projectSet.add(new Project(5, "Online Book Shop", 2, Util.toDate("2023-01-14"), ".NET"));
		projectSet.add(new Project(3, "Online Jewelry Shop", 4, Util.toDate("2023-01-31"), "Java"));
		projectSet.add(new Project(2, "Bus Reservation System", 3, Util.toDate("2023-01-31"), "JS"));

		while ((choice = menu(sc)) != 0) {
			switch (choice) {

			case 1:
				Project newProject = new Project();
				System.out.println("Enter Project Details");
				System.out.print("Enter ID = ");
				newProject.setId(sc.nextInt());
				System.out.print("Enter Title = ");
				newProject.setTitle(sc.next());
				System.out.print("Enter Team Size = ");
				newProject.setTeamSize(sc.nextInt());
				System.out.print("Enter Technology = ");
				newProject.setTechnology(sc.next());
				System.out.print("Enter Start Date = ");
				newProject.setStartDate(Util.toDate(sc.next()));
				if(projectSet.contains(newProject)) {
					System.out.println("Duplicate Project Id");
				}else System.out.println("New Project Added...");
				
				projectSet.add(newProject);
				
				break;

			case 2:
				projectSet.forEach(x -> System.out.println(x));
				break;

			case 3:

				System.out.print("Enter project id to be deleted = ");
				int id = sc.nextInt();
				int status = 0;
				Project p1 = new Project();
				p1.setId(id);
				for (Project project : projectSet) {
					if (project.getId() == p1.getId()) {
						status = 1;
						projectSet.remove(p1);
						System.out.println("Project Deleted...");
						break;
					}
				}
				if (status == 0)
					System.out.println("Wrong Project id...");
				break;

			case 4:

				for (Project project : projectSet) {
					Project temp = new Project();
					temp.setId(project.getId());
					temp.setTitle(project.getTitle());
					temp.setStartDate(project.getStartDate());
					temp.setTeamSize(project.getTeamSize());
					temp.setTechnology(project.getTechnology());
					projectArr.add(temp);

				}
				System.out.println("Copied objects from set to ArrayList.");

				break;
				
			case 5:
				projectArr.forEach(o -> System.out.println(o));
				break;
				
			case 6:
				
				//anonymous inner class
				/*
				Comparator<Project> dateCoparator = new Comparator<Project>() {
					
					@Override
					public int compare(Project p1, Project p2) {
						
						return p1.getStartDate().compareTo(p2.getStartDate());
					}
				};
				
				projectArr.sort(dateCoparator);
				
				
				// anonymous object of anonymous inner class
				projectArr.sort(new Comparator<Project>() {
					
					@Override
					public int compare(Project p1, Project p2) {
						
						return p1.getStartDate().compareTo(p2.getStartDate());
					}
				});
				
				*/
				
			//Lambda Expression
				projectArr.sort( (pro1,pro2) -> pro1.getStartDate().compareTo(pro2.getStartDate()));
				projectArr.forEach(p->System.out.println(p));
				break;
			
			case 7:
					System.out.println("Max TeamSize = "+Collections.max(projectSet,(o1,o2)-> o1.getTeamSize()-(o2.getTeamSize())).getTeamSize());
				break;
				
			case 8:
				List <String>list = new ArrayList<String>();
				
				for (Project project : projectSet) {
					list.add(project.getTechnology());
				}
				Stream <String> strm = list.stream();
				
				System.out.println("Total Java Projects = "+strm.filter(ele->ele.equals("Java")).count());
				break;
			default:
				break;
			}
		}
	}
}

