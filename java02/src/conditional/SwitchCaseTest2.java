package conditional;

import java.util.Date;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();
		
		switch (day) {
		case 0: case 6:
			System.out.println("스프링 공부 하자...");
			break;
		default:
			System.out.println("자바 공부 하자...");
			break;
		}
		
		//	계절 판별
		switch (month) {
		case value:
			
			break;

		default:
			break;
		}
	}

}
