package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam07 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("K-POP 인기 투표");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 486, 54);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\bji15\\eclipse-workspace\\java02\\img\\meet_our_Friday.jpg"));
		btnNewButton.setBounds(71, 114, 101, 103);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\bji15\\eclipse-workspace\\java02\\img\\red_flavor.jpg"));
		btnNewButton_1.setBounds(71, 253, 101, 103);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\bji15\\eclipse-workspace\\java02\\img\\next_level.jpg"));
		btnNewButton_2.setBounds(71, 390, 101, 103);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton_3.setBounds(196, 114, 221, 103);
		f.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setBounds(196, 253, 221, 103);
		f.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("New button");
		btnNewButton_3_2.setBounds(196, 390, 221, 103);
		f.getContentPane().add(btnNewButton_3_2);
		f.setVisible(true);
	}
}
