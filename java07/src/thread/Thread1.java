package thread;

import java.util.Iterator;

public class Thread1 extends Thread {
	
	@Override
	public void run() {
		//	동시에 처리하고 싶은 내용
		for (int i = 0; i < 1000; i++) {
			System.out.println("증가 : " + i);
		}
	}
}
