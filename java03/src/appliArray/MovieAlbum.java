package appliArray;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MovieAlbum {
	private static JTextField bottom;
	
	static int location = 0;

	public static void main(String[] args) {
		int size = 5;
		//	제목
		String[] title = {"인생은 아름다워", "정직한 후보2", "공조2", "늑대사냥", "아바타"};
		
		//	포스터 이미지
		String[] img = {"movie_image1.jpg", "movie_image2.jpg", "movie_image3.jpg", "movie_image4.jpg", "movie_image5.jpg"};
		
		//	평점
		double[] score = {8.87, 7.85, 8.03, 5.47, 9.57};
		
		JFrame f = new JFrame();
		f.setSize(413, 428);
		
		JLabel top = new JLabel(title[location]);
		top.setBackground(Color.YELLOW);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		center.setIcon(new ImageIcon("C:\\Users\\bji15\\eclipse-workspace\\java02\\img\\" + img[location]));
//		center.setIcon(new ImageIcon("img/" + img[location]));
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		bottom = new JTextField();
		bottom.setHorizontalAlignment(SwingConstants.CENTER);
		bottom.setFont(new Font("굴림", Font.BOLD, 40));
		bottom.setText(score[location] + "점");
		f.getContentPane().add(bottom, BorderLayout.SOUTH);
		bottom.setColumns(10);
		
		JButton leftBtn = new JButton("<<");
		leftBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (location > 0) {
					location--;
					top.setText(title[location]);
					bottom.setText(score[location] + "점");
					ImageIcon icon = new ImageIcon("img/" + img[location]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "왼쪽 끝입니다.");
				}
			}
		});
		leftBtn.setBackground(Color.GREEN);
		leftBtn.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(leftBtn, BorderLayout.WEST);
		
		JButton rightBtn = new JButton(">>");
		rightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (location < 4) {
					location++;
					top.setText(title[location]);
					bottom.setText(score[location] + "점");
					ImageIcon icon = new ImageIcon("img/" + img[location]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "오른쪽 끝입니다.");
				}
			}
		});
		rightBtn.setBackground(Color.GREEN);
		rightBtn.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(rightBtn, BorderLayout.EAST);
		f.setVisible(true);
	}

}
