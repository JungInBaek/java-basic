package useinheritance;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarRace extends JFrame {
	
	public CarRace() {
		setTitle("나의 자동차 경주 게임");
		setSize(1400, 600);
		setLayout(null);// absolute layout

		Car car1 = new Car("img/car01.png", 100, 0);
		Car car2 = new Car("img/car02.png", 100, 150);
		Car car3 = new Car("img/car03.png", 100, 300);
		
		car1.start();
		car2.start();
		car3.start();
		setVisible(true);
	}

	
	public class Car extends Thread {
		int x, y;
		JLabel label;

		public Car(String file, int x, int y) {
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel(icon);
			this.x = x;
			this.y = y;
			label.setBounds(x, y, 150, 150);
			add(label);
		}

		@Override
		public void run() {
			Random	r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50);//0~49
				x = x + move;
				label.setBounds(x, y, 150, 150);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		CarRace name = new CarRace();
	}

}
