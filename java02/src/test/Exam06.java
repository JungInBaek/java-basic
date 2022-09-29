package test;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int yjs = 0;
		int bts = 0;		
	
		boolean exit = true;
		while(exit) {
			System.out.print("아이유(1), 유재석(2), 방탄(3), 종료(0)>> ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				iu++;
				break;
			case 2:
				yjs++;
				break;
			case 3:
				bts++;
				break;
			case 0:
				System.out.println("투표를 종료합니다.");
				exit = false;
				break;
			default :
				System.out.println("화면에 표시된 숫자들 중에서 입력해주세요!");
				break;
			}
		}
		
		System.out.println("아이유 : " + iu);
		System.out.println("유재석 : " + yjs);
		System.out.println("방탄 : " + bts);		
	}

}
