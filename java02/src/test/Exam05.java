package test;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int front = 0;
		int back = 0;
		
		String exit = "";
		int count = 0;
		do {
			count++;
			System.out.print("숫자1 입력>> ");
			int num1 = sc.nextInt();
			System.out.print("숫자2 입력>> ");
			int num2 = sc.nextInt();

			if (num1 > num2) {
				front++;
				System.out.println("앞 숫자가 더 큽니다");
			} else if (num1 == num2) {
				System.out.println("두 숫자가 동일합니다");
			} else {
				back++;
				System.out.println("뒷 숫자가 더 큽니다");
			}
			
			System.out.println("=========================");
			System.out.println("앞 숫자가 더 큰 횟수 : " + front);
			System.out.println("뒷 숫자가 더 큰 횟수 : " + back);
			System.out.println("=========================");
			System.out.print("종료할까요?(x) 계쇽할까요?(o) : ");
			exit = sc.next();
		} while (exit.equals("o"));
		
		System.out.println("종료합니다. " + count + "회 반복함.");
	}

}
