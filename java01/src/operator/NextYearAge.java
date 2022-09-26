package operator;

import javax.swing.JOptionPane;

public class NextYearAge {

	public static void main(String[] args) {
		//	입력
		String str = JOptionPane.showInputDialog("올해 나이 입력");
		
		//	처리
		int age = Integer.parseInt(str);
		int result = ++age;
		
		//	출력
		JOptionPane.showMessageDialog(null, "내년 나이는 " + result);
	}

}
