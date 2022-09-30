package useclass;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiaryMain {
	private static JTextField idt;
	private static JPasswordField pwt;

	public static void main(String[] args) {
		String id = "test";
		String pw = "test";
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 255, 0));
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bji15\\eclipse-workspace\\java04\\img\\diary.jpg"));
		lblNewLabel.setBounds(101, 21, 300, 200);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(51, 235, 115, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		idt = new JTextField();
		idt.setFont(new Font("굴림", Font.BOLD, 20));
		idt.setBounds(178, 235, 245, 50);
		f.getContentPane().add(idt);
		idt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(51, 295, 115, 50);
		f.getContentPane().add(lblNewLabel_1_1);
		
		pwt = new JPasswordField();
		pwt.setFont(new Font("굴림", Font.BOLD, 20));
		pwt.setColumns(10);
		pwt.setBounds(178, 295, 245, 50);
		f.getContentPane().add(pwt);
		
		JButton loginBtn = new JButton("");
		loginBtn.setBackground(new Color(255, 255, 128));
		loginBtn.setIcon(new ImageIcon("C:\\Users\\bji15\\eclipse-workspace\\java04\\img\\login.png"));
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (idt.getText().equals(id) && pwt.getText().equals(pw)) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					WriteDiary wd = new WriteDiary();
					wd.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		loginBtn.setBounds(74, 390, 161, 115);
		f.getContentPane().add(loginBtn);
		
		JButton resetBtn = new JButton("");
		resetBtn.setBackground(new Color(255, 255, 128));
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				idt.setText("");
				pwt.setText("");
			}
		});
		resetBtn.setIcon(new ImageIcon("C:\\Users\\bji15\\eclipse-workspace\\java04\\img\\reset.png"));
		resetBtn.setBounds(262, 390, 161, 115);
		f.getContentPane().add(resetBtn);
		f.setVisible(true);
	}
}
