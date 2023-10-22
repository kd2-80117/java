package com.election;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A14_Q1_Main {

	@SuppressWarnings("resource")
	static int menu() {
		System.out.println("--------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add new Candidate");
		System.out.println("2. Delete given Candidate");
		System.out.println("3. Update Candidate");
		System.out.println("4. Increment Candidate vote");
		System.out.println("5. Display all Candidates");
		System.out.println("6. Display Candidates of given Party");
		System.out.println("7. Get Party wise vote count");
		System.out.print("Enter your choice = ");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("--------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		int choice;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while ((choice = menu()) != 0) {
			switch (choice) {

			case 1:

				try (CandidateDAO cdao = new CandidateDAO()) {
					Candidate candidate = new Candidate();
					System.out.println("Enter Candidate Details:");
					System.out.print("Enter name = ");
					candidate.setName(sc.next());
					System.out.print("Enter party = ");
					candidate.setParty(sc.next());
					System.out.println("Candidate Details Added...");
					System.out.println("Rows Added = " + cdao.save(candidate));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:

				try (
					CandidateDAO cdao = new CandidateDAO()){
					System.out.print("Enter candidate id to be deleted = ");
					int id = sc.nextInt();
					System.out.println(cdao.deleteById(id) + " Candidate Deleted...");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				try (
					CandidateDAO cdao = new CandidateDAO()){
					Candidate candidate = new Candidate();
					System.out.print("Enter Candidate id to update = ");
					int id = sc.nextInt();
					candidate.setId(id);
					System.out.print("Enter name = ");
					candidate.setName(sc.next());
					System.out.print("Enter party = ");
					candidate.setParty(sc.next());
					System.out.println(cdao.update(candidate) + " Candidate Details Updated...");

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4: {
				try (CandidateDAO cdao = new CandidateDAO()) {
					Candidate candidate = new Candidate();
					System.out.print("Enter Candidate id to increment vote = ");
					int id = sc.nextInt();
					candidate.setId(id);
					System.out.println("Candidate Vote Incremented...");
					System.out.println("Rows Affected = " + cdao.incrementVotes(id));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

				break;

			case 5:
				try (
					CandidateDAO cdao = new CandidateDAO()){
					List<Candidate> list = new ArrayList<>();
					list = cdao.showAll();
					list.forEach(l -> System.out.println(l));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 6:
				try (CandidateDAO cdao = new CandidateDAO()) {
					System.out.print("Enter party: ");
					String party = sc.next();
					List<Candidate> list = cdao.findByParty(party);
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
			case 7:
				try (
					CandidateDAO cdao = new CandidateDAO()){
					List<PartyVotes> list = new ArrayList<>();
					list = cdao.getPartyWiseVotes();
					list.forEach(l -> System.out.println(l));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}

		}

	}

}
