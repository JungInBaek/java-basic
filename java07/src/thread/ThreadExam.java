package thread;

public class ThreadExam {

	public static void main(String[] args) {
		PrintThread1 pt1 = new PrintThread1();
		PrintThread2 pt2 = new PrintThread2();
		PrintThread3 pt3 = new PrintThread3();
		
		pt1.start();
		pt2.start();
		pt3.start();
	}
}
