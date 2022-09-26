package practice;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		//	입력
		String strHeight = JOptionPane.showInputDialog("키를 입력해주세요.");
		
		//	처리
		double height = Double.parseDouble(strHeight);
		double result = (height - 100) * 0.9;
		
		//	출력
		JOptionPane.showMessageDialog(null, "적정 몸무게는 " + result + "kg 입니다.");
	}

}
