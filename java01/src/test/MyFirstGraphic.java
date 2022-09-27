package test;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFirstGraphic {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(58, 62, 150, 35);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(206, 65, 247, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton whereBtn = new JButton("어디로 갈까?");
		whereBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("홍차") || s1.equals("커피")) {
					JOptionPane.showMessageDialog(f, "카페로 가세요");					
				} else {
					JOptionPane.showMessageDialog(f, "집에서 물이나 드세요");
				}
			}
		});
		whereBtn.setFont(new Font("굴림", Font.BOLD, 20));
		whereBtn.setBounds(58, 107, 395, 41);
		f.getContentPane().add(whereBtn);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(58, 195, 136, 35);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(206, 198, 247, 35);
		f.getContentPane().add(t2);
		
		JButton ageBtn = new JButton("나의 내년 나이는?");
		ageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int age = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, "내년에 " + (age + 1) + "세 입니다.");
			}
		});
		ageBtn.setFont(new Font("굴림", Font.BOLD, 20));
		ageBtn.setBounds(58, 240, 395, 41);
		f.getContentPane().add(ageBtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어점수");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(58, 319, 136, 35);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setColumns(10);
		t3.setBounds(206, 322, 247, 35);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_2 = new JLabel("수학점수");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(58, 373, 136, 35);
		f.getContentPane().add(lblNewLabel_1_2);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 20));
		t4.setColumns(10);
		t4.setBounds(206, 376, 247, 35);
		f.getContentPane().add(t4);
		
		JButton avgBtn = new JButton("두과목 점수의 평균은?");
		avgBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				
				double korean = Double.parseDouble(s3);
				double math = Double.parseDouble(s4);
				double sum = korean + math;
				double avg = sum / 2;
				
				JOptionPane.showMessageDialog(f, "평균은 " + avg + "점 입니다.");
			}
		});
		avgBtn.setFont(new Font("굴림", Font.BOLD, 20));
		avgBtn.setBounds(58, 442, 395, 41);
		f.getContentPane().add(avgBtn);
		f.setVisible(true);
	}

}
