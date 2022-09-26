package practice;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		//	입력
		String carrier = JOptionPane.showInputDialog("통신사를 입력해주세요.");
		String phone = JOptionPane.showInputDialog("전화번호를 입력해주세요.");
		String name = JOptionPane.showInputDialog("이름을 입력해주세요.");
		
		//	처리
		String result = name + "님은 " + carrier + "에 " + phone;
		
		//	출력
		JOptionPane.showMessageDialog(null, result);
	}

}
