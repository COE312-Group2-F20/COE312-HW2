package HW2;

public class Dining_Hall extends Classroom implements Room {
	static String room = "Dining Hall";
	static String character = "Professor Dumbledore";

	Dining_Hall() {

		super(room, character);

	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		System.out.print("\nThe " + room + " is the biggest open area inside Hogwarts. " + character
				+ " is in the hall to welcome new students.\n\n");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("You have entered the " + room + ".");
	}

}