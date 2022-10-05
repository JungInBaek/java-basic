package thread;

public class ArrayThread extends Thread {

	String[] s = { "감자", "고구마", "양파", "국수", "자장면" };

	@Override
	public void run() {
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식 이름>> " + s[i]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
