package useinheritance;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UseThread2 extends JFrame {

	UseThread2 f;
	
	JLabel remainTimeLabel;
	JLabel useTimeLabel;
	
	UseTimeThread utt = new UseTimeThread();
	RemainTimeThread rtt = new RemainTimeThread();
	
	int time = 500;

	public UseThread2() {
		f = this;
		this.setSize(800, 500);
		getContentPane().setLayout(null);
		
		remainTimeLabel = new JLabel("남은 시간");
		remainTimeLabel.setFont(new Font("굴림", Font.BOLD, 20));
		remainTimeLabel.setBounds(551, 120, 223, 36);
		getContentPane().add(remainTimeLabel);
		
		useTimeLabel = new JLabel("사용 시간");
		useTimeLabel.setFont(new Font("굴림", Font.BOLD, 20));
		useTimeLabel.setBounds(551, 74, 223, 36);
		getContentPane().add(useTimeLabel);
		
		utt.start();
		rtt.start();
		
		JButton stopButton = new JButton("사용 종료");
		stopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				utt.stop();
				rtt.stop();
				System.exit(0);
			}
		});
		stopButton.setBounds(551, 28, 91, 36);
		getContentPane().add(stopButton);
		
		this.setVisible(true);		
	}

	public static void main(String[] args) {
		UseThread2 ut2 = new UseThread2();
	}
	
	public class UseTimeThread extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < time; i++) {
				useTimeLabel.setText("사용 시간: " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public class RemainTimeThread extends Thread {
		
		@Override
		public void run() {
			for (int i = time; i > 0; i--) {
				remainTimeLabel.setText("남은 시간: " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
