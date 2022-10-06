package useinheritance;

import javax.swing.JOptionPane;

public class CounterThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 20; i > 0; i--) {
			System.out.println("카운터>> " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (i == 1) {
				JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다. 퇴실부탁드립니다.");		
			}
		}
	}
}
