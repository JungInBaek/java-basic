package staticpackage;

import javax.swing.JOptionPane;

public class UseStaticMethod {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("숫자 입력");
		int n = Integer.parseInt(s);
		System.exit(0);
	}

}
