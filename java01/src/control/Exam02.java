package control;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.setVisible(true);
		
		//	4
		String strPhysical = JOptionPane.showInputDialog("체육 성적 입력");
		String strMath = JOptionPane.showInputDialog("수학 성적 입력");
		String strEnglish = JOptionPane.showInputDialog("영어 성적 입력");
		String strKorean = JOptionPane.showInputDialog("국어 성적 입력");
		
		double physical = Double.parseDouble(strPhysical);
		double math = Double.parseDouble(strMath);
		double english = Double.parseDouble(strEnglish);
		double korean = Double.parseDouble(strKorean);
		
		double sum = physical + math + english + korean;
		double avg = sum / 4;
		
		JOptionPane.showMessageDialog(f, "평균 : " + avg);
		
		//	5
		Double pi = 3.14;
		String strRadius = JOptionPane.showInputDialog("반지름 입력");
		
		double radius = Double.parseDouble(strRadius);
		double area = pi * radius * radius;
		
		JOptionPane.showMessageDialog(f, "원의 면적 : " + area);
	}

}
