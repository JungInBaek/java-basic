package control;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class Exam01 {
	private static final JButton btnNewButton_2 = new JButton("New button");

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		//	1
		boolean login = false;
		char cPw = 'p'; 
		String strPw = JOptionPane.showInputDialog("암호 입력");
		char pw = strPw.charAt(0);
		
		if (pw == cPw) {
			JOptionPane.showMessageDialog(f, "PASS!");
			login = true;
		} else {
			JOptionPane.showMessageDialog(f, "재입력!");
		}
		
		//	2
		String strYesterday = JOptionPane.showInputDialog("어제 몸무게 입력");
		String strToday = JOptionPane.showInputDialog("오늘 몸무게 입력");
		
		double yesterday = Double.parseDouble(strYesterday);
		double today = Double.parseDouble(strToday);
		double result = yesterday - today;
		
		//	3
		if (result > 2 && login == true) {
			JOptionPane.showMessageDialog(f, "오늘은 성공!");
		} else {
			JOptionPane.showMessageDialog(f, "내일 다시 도전!");
		}
	}

}
