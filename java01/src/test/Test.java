package test;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_3, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
	}

}
