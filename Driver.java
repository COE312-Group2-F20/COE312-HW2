package HW2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phrase;
		String path;
		String action;
		Scanner obj = new Scanner(System.in);
		Watch watch = new Watch();
		Harry harry = new Harry("Main Hall", watch);
		Hermione hermione = new Hermione("Library", harry);
		System.out.print(
				"\"Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to magical Mischief-Makers are proud to present THE MARAUDER'S MAP.\n"
						+ "Say the magic phrase to reveal the map.\n>");
		phrase = obj.nextLine();
		while (phrase != null) {
			if (!phrase.equals("I solemnly swear that I am up to no good")) {
				System.out.print("Wrong magic phrase... Try again!\n>");
				phrase = obj.nextLine();
			} else if (phrase.equals("Mischief managed")) {

				System.exit(2);
			} else {
				break;
			}
		}

		System.out.println(
				"\nThe Entrance\n\nYou arrive at the doors of Hogwarts. \nThe door on the north wall leads to the dining hall, the door to the east leads to the Potions class, and the door to the west leads to the Library.");
		System.out.print(
				"\n***************\nThis is actions menu (Beware: everything is case-sensitive): \n1. Walk North \n2. Walk East \n3. Walk West\n***************\n\n>");
		path = obj.nextLine();

		while (!path.equals("Mischief managed")) {
			switch (path) {
			case "Walk North":
				System.out.println();
				Dining_Hall dining = new Dining_Hall();
				dining.walk();
				dining.look();

				harry.setloc("Dining Hall");
				System.out.print("\n***************\nThis is actions menu:\n1. Go to Main Hall\n***************\n\n>");

				action = obj.nextLine();
				while (!action.equals("Go to Main Hall") || action.equals("Mischief managed")) {
					if (action.equals("Mischief managed")) {
						System.out.println("Hiding map contents...end.");
						System.exit(1);
					} else
						System.out.print("\nAction does not exist... Try again!\n\n>");
					action = obj.nextLine();
				}

				break;
			case "Walk East":
				System.out.println();

				Potions_Classroom potion = new Potions_Classroom();
				potion.walk();
				potion.look();

				harry.setloc("Potions Classroom");
				System.out.print("\n***************\nThis is actions menu:\n1. Go to Main Hall\n***************\n\n>");
				action = obj.nextLine();
				while (!action.equals("Go to Main Hall") || action.equals("Mischief managed")) {
					if (action.equals("Mischief managed")) {
						System.out.println("Hiding map contents...end.");
						System.exit(1);
					} else
						System.out.print("\nAction does not exist... Try again!\n\n>");
					action = obj.nextLine();
				}
				break;
			case "Walk West":
				System.out.println();

				Library lib = new Library();
				lib.walk();
				lib.look();
				harry.setloc("Library");
				System.out.print("\n***************\nThis is actions menu:\n1. Go to Main Hall\n***************\n\n");
				action = obj.nextLine();
				while (!action.equals("Go to Main Hall") || action.equals("Mischief managed")) {
					if (action.equals("Mischief managed")) {
						System.out.println("Hiding map contents...end.");
						System.exit(1);
					} else
						System.out.print("\nAction does not exist... Try again!\n\n>");
					action = obj.nextLine();
				}
				break;
			default:
				System.out.println("\nAction not available. Redirecting you to Main Hall.");

			}
			System.out.println("\nYou are now in the Main Hall. Pick where to go");
			System.out.print(
					"\n***************\nThis is actions menu: \n1. Walk North \n2. Walk East \n3. Walk West\n***************\n\n>");

			path = obj.nextLine();

		}
		System.out.println("Hiding map contents...end.");
		System.exit(1);
		obj.close();

	}

}
