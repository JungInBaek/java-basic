package repeat;

import java.util.Random;

import javax.swing.JOptionPane;

public class GuessAnswer {

	public static void main(String[] args) {
		Random random = new Random();
		int target = random.nextInt(100);
		int no = 0;
		int count = 0;
		
		while(true) {
			count++;
			String data = JOptionPane.showInputDialog("숫자 입력");
			int data2 = Integer.parseInt(data);
			
			if (data2 == target) {
				System.out.println("정답은 " + target + "입니다!");
				System.out.println("축하합니다!!");
				System.out.println("전체 시도 횟수 : " + count);
				System.exit(0);
			} else if (data2 > target) {
				no++;
				System.out.println("너무 커요!");
				System.out.println("틀린 시도 횟수 : " + no);
			} else {
				no++;
				System.out.println("너무 작아요!");
				System.out.println("틀린 시도 횟수 : " + no);
			}
		}
	}

}
