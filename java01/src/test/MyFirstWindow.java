package test;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class MyFirstWindow {
	private static JTextField textField;

	public static void main(String[] args) {
		//	1. JFrame 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		
		//	2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		//	3. 새로 만든 부품 출력 설정
		f.setVisible(true);
	}

}
