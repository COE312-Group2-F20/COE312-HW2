package HW2;

import java.util.concurrent.TimeUnit;

public class Watch implements Runnable {
	int time = 0;
	int endtime = 0;
	Harry harry;

	Watch() {
		Thread t = new Thread(this);
		t.start();
	}

	int getTime() {
		return time;
	}

	int getEndTime() {
		return endtime;
	}

	synchronized void tellTime() {
		for (int i = 0; i < 3; i++) {
			try {
				TimeUnit.MINUTES.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			time = time + 1;
			System.out.print(time + " minutes passed...\n>");
		}
		endtime = 1;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			tellTime();
		}

	}

}
