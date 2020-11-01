package HW2;

public class Library extends Classroom implements Room {
	static String room = "Library";
	static String character = "Hermione";

	Library() {

		super(room, character);

	}

	public void look() {
		// TODO Auto-generated method stub
		System.out.print("\nThe " + room + " is where students spend a lot of their time. Here comes " + character
				+ " to show you what you can do in the " + room + ".\n");
	}

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("You have entered the " + room + ".");
	}

}