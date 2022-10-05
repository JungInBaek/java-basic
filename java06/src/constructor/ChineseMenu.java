package constructor;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChineseMenu {
	
	private static JTextField t1;
	static final int BLACK_PRICE = 5000;
	static final int JJAMBBONG_PRICE = 6000;
	static final int UDON_PRICE = 6000;
	static int totalPrice;
	static int count;
	static int black;
	static int jjambbong;
	static int udon;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(new Color(128, 255, 128));
		f.getContentPane().setForeground(new Color(0, 0, 0));
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(476, 28, 62, 37);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(128, 255, 255));
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(550, 28, 193, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(new Color(255, 0, 0));
		result.setFont(new Font("굴림", Font.BOLD, 20));
		result.setBounds(81, 488, 606, 65);
		f.getContentPane().add(result);
		
		JLabel center = new JLabel("New label");
		center.setIcon(new ImageIcon("C:\\Users\\bji15\\eclipse-workspace\\java06\\img\\짜장.jpg"));
		center.setBounds(81, 88, 606, 390);
		f.getContentPane().add(center);
		
		JButton btn1 = new JButton("짜장");
		btn1.setBackground(new Color(128, 64, 0));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//	주문량을 현재 카운트에 하나 플러스
				count++;
				//	짜장 주문량
				black++;
				//	프레임 제목 변경
				f.setTitle("짜장 총 주문량 : " + black + ", 짬뽕 총 주문량 : " + jjambbong + ", 우동 총 주문량 : " + udon);
				//	현재 주문량 변경
				t1.setText(count + "개");
				//	center라벨에 있는 이미지 변경
				center.setIcon(new ImageIcon("img/짜장.jpg"));
				//	result라벨에 있는 결제금액 변경
				totalPrice += BLACK_PRICE;
				result.setText("결제금액 : " + totalPrice);
			}
		});
		btn1.setBounds(78, 28, 96, 50);
		f.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("짬뽕");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//	주문량을 현재 카운트에 하나 플러스
				count++;
				//	짬뽕 주문량
				jjambbong++;
				//	프레임 제목 변경
				f.setTitle("짜장 총 주문량 : " + black + ", 짬뽕 총 주문량 : " + jjambbong + ", 우동 총 주문량 : " + udon);
				//	현재 주문량 변경
				t1.setText(count + "개");
				//	center라벨에 있는 이미지 변경
				center.setIcon(new ImageIcon("img/짬뽕.jpg"));
				//	result라벨에 있는 결제금액 변경
				totalPrice += JJAMBBONG_PRICE;
				result.setText("결제금액 : " + totalPrice);
			}
		});
		btn2.setBackground(new Color(255, 0, 0));
		btn2.setBounds(187, 28, 96, 50);
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("우동");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//	주문량을 현재 카운트에 하나 플러스
				count++;
				//	우동 주문량
				udon++;
				//	프레임 제목 변경
				f.setTitle("짜장 총 주문량 : " + black + ", 짬뽕 총 주문량 : " + jjambbong + ", 우동 총 주문량 : " + udon);
				//	현재 주문량 변경
				t1.setText(count + "개");
				//	center라벨에 있는 이미지 변경
				center.setIcon(new ImageIcon("img/우동.jpg"));
				//	result라벨에 있는 결제금액 변경
				totalPrice += UDON_PRICE;
				result.setText("결제금액 : " + totalPrice);
			}
		});
		btn3.setBackground(new Color(255, 255, 128));
		btn3.setBounds(295, 28, 96, 50);
		f.getContentPane().add(btn3);
		
		f.setVisible(true);
	}
}
