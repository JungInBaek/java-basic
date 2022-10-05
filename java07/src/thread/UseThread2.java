package thread;

public class UseThread2 {

	public static void main(String[] args) {
		CountThread ct = new CountThread();
		VisionThread vt = new VisionThread();
		ArrayThread at = new ArrayThread();
		
		ct.start();
		vt.start();
		at.start();
	}

}
