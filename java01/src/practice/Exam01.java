package practice;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		//	입력
		String strWidth = JOptionPane.showInputDialog("가로 길이를 입력해주세요.");
		String strHeight = JOptionPane.showInputDialog("세로 길이를 입력해주세요.");
		
		//	처리
		int width = Integer.parseInt(strWidth);
		int height = Integer.parseInt(strHeight);
		int result = width * height;
		
		//	출력
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + result);
	}

}
