package useinheritance;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;

import javax.jws.soap.SOAPBinding.Style;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadGraphic1 extends JFrame {

	JLabel countLabel;
	JLabel imageLabel;
	JLabel timeLabel;
	
	CounterThread2 ct;
	TimeThread2 tt;
	ImgThread2 it;
	
	ThreadGraphic1 f;

	public ThreadGraphic1() {
		f = this;
		getContentPane().setFont(new Font("굴림", Font.BOLD, 20));
		this.setSize(800, 500);

		countLabel = new JLabel("카운트");
		countLabel.setFont(new Font("굴림", Font.BOLD, 20));
		imageLabel = new JLabel("이미지");
		imageLabel.setFont(new Font("굴림", Font.BOLD, 20));
		timeLabel = new JLabel("시간");
		timeLabel.setFont(new Font("굴림", Font.BOLD, 20));		
		
		getContentPane().add(countLabel, BorderLayout.WEST);
		getContentPane().add(imageLabel, BorderLayout.EAST);
		getContentPane().add(timeLabel, BorderLayout.SOUTH);

		ct = new CounterThread2();
		tt = new TimeThread2();
		it = new ImgThread2();

		ct.start();
		tt.start();
		it.start();
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		ThreadGraphic1 tg1 = new ThreadGraphic1();
	}

	public class CounterThread2 extends Thread {

		@Override
		public void run() {
			for (int i = 20; i > 0; i--) {
				// System.out.println("카운터>> " + i);
				countLabel.setText("카운트>> " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (i == 1) {
					JOptionPane.showMessageDialog(f, "사용시간이 다 되었습니다. 퇴실부탁드립니다.");
					it.stop();
					tt.stop();
				}
			}
		}
	}

	public class TimeThread2 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
//				System.out.println("현재: " + date);
				timeLabel.setText("시간>> " + date);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public class ImgThread2 extends Thread {

		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length; i++) {
//				System.out.println("이미지>> " + list[i]);
				imageLabel.setText("");
				imageLabel.setIcon(new ImageIcon("img/" + list[i]));
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (i == list.length - 1) {
					i = -1;
				}
			}
		}
	}

}
