package thread;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("@");
		}
	}
}
