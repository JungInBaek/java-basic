package conditional;

import java.util.Date;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();

		switch (day) {
		case 0:
		case 6:
			System.out.println("스프링 공부 하자...");
			break;
		default:
			System.out.println("자바 공부 하자...");
			break;
		}

		// 계절 판별
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
		default:
			break;
		}
	}

}
