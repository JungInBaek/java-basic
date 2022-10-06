package thread;

public class UseThread2 {

	public static void main(String[] args) {
		CountThread ct = new CountThread();
		DateThread vt = new DateThread();
		ArrayThread at = new ArrayThread();
		
		ct.start();
		vt.start();
		at.start();
	}

}
