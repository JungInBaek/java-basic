package test;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("전화번호 입력>> ");
		String[] phone = sc.next().trim().split("-");
		

		// 3.
		if (phone[0].equals("019")) {
			System.out.println("LGT");
		} else if (phone[0].equals("011")) {
			System.out.println("SKT");
		} else {
			System.out.println("Apple");
		}
		
		// 4.
		if (phone[1].length() < 4) {
			System.out.println("올드폰");
		} else {
			System.out.println("최신폰");
		}
		
		// 5.
		if ((phone[0] + phone[1] + phone[2]).length() < 10) {
			System.out.println("유효하지 않은 전화번호");
		} else {
			System.out.println("유효한 전화번호");
		}
	}

}
