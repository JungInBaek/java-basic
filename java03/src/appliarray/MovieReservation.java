package appliarray;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MovieReservation {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550, 750);
		
		//	레이아웃 지정
		//	왼쪽부터 물 흐르듯 순서대로 배치
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int[] seat = new int[500];
		
		for (int i = 1; i <= 500; i++) {
			JButton btn = new JButton("좌석" + i);
			f.add(btn);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					btn.setEnabled(false);
					btn.setBackground(Color.red);
					int index = Integer.parseInt(s.substring(2));
					seat[index] = 1;

					int count = 0;
					for (int j : seat) {
						if (seat[j] == 1) {
							count++;
						}												
					}
					
					JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개");					
					JOptionPane.showMessageDialog(f, "최종 결제금액은 " + (13000 * count) + "원");
				}
			});
		}
		
		f.setVisible(true);
	}

}
