package test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.getContentPane().setFont(new Font("굴림", Font.BOLD, 20));
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(71, 101, 100, 60);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(172, 104, 250, 60);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(71, 182, 100, 60);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(172, 185, 250, 60);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//	plus 버튼
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int num1 = Integer.parseInt(n1);
				int num2 = Integer.parseInt(n2);
				int result = num1 + num2;
				
				JOptionPane.showMessageDialog(f, "결과 : " + result);
			}
		});
		plus.setForeground(Color.WHITE);
		plus.setBackground(Color.GREEN);
		plus.setFont(new Font("굴림", Font.BOLD, 30));
		plus.setBounds(85, 305, 136, 60);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//	minus 버튼
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int num1 = Integer.parseInt(n1);
				int num2 = Integer.parseInt(n2);
				int result = num1 - num2;
				
				JOptionPane.showMessageDialog(f, "결과 : " + result);
			}
		});
		minus.setForeground(Color.WHITE);
		minus.setBackground(Color.RED);
		minus.setFont(new Font("굴림", Font.BOLD, 30));
		minus.setBounds(286, 305, 136, 60);
		f.getContentPane().add(minus);
		
		f.setVisible(true);
	}

}
