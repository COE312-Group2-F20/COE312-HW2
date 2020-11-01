package HW2;

public class Hermione implements Runnable {
	String location;
	Harry harry;
	boolean running = true;

	Hermione(String l, Harry h) {
		this.location = l;
		this.harry = h;
		Thread t = new Thread(this);
		t.start();
	}

	synchronized void callHarry() {
		if (harry.getloc().equals("Library")) {
			System.out.println("\nHermione: Harry, I am here!");
			running = false;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (running) {
			callHarry();

		}

	}
}
