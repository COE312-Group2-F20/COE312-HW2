package HW2;

import java.util.concurrent.TimeUnit;

public class Harry implements Runnable {
	String location;
	Watch watch;
	boolean notfound = true;

	Harry(String l, Watch w) {
		this.location = l;
		this.watch = w;
		Thread t = new Thread(this);
		t.start();
	}

	void setloc(String loc) {
		this.location = loc;
	}

	synchronized void UrgentClose() {
		System.out.print("You have 10 seconds to close the map.\n\n>");
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("You have been caught... and the Marauder's map has been confiscated.");
		System.exit(2);
	}

	synchronized void CallHermione() {
		if (location.equals("Library")) {
			try {
				TimeUnit.MILLISECONDS.sleep(1);
				// TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nHarry: Found Hermione!\n\n>");
			notfound = false;
		}

	}

	String getloc() {
		return location;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (notfound) {
			CallHermione();
			if (watch.getEndTime() == 1) {
				UrgentClose();
			}

		}
	}
}