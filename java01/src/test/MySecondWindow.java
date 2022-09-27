package test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MySecondWindow {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(70, 87, 57, 36);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(152, 90, 249, 36);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 149, 249, 36);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 208, 249, 36);
		f.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 149, 118, 36);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(34, 208, 93, 36);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(70, 317, 138, 61);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(263, 317, 138, 61);
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);
	}
}
