package HW2;

public class Potions_Classroom extends Classroom implements Room {
	static String room = "Potions";
	static String character = "Professor Snape";

	Potions_Classroom() {

		super(room, character);

	}

	public void look() {
		System.out.print("\n" + room + " is one of the core subjects that first year students are required to study. "
				+ character + " is here to guide you through your first class!\n\n");
		// TODO Auto-generated method stub

	}

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("You have entered the " + room + " Classroom.");

	}

}