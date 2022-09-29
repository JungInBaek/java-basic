package test;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 1.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력>> ");
			arr[i] = sc.nextInt();
		}
		
		int sum = arr[0] + arr[2];
		System.out.println("합계 : " + sum);
		
		// 2.
		String[] str = new String[3];
		
		for (int i = 0; i < str.length; i++) {
			System.out.print("글자 입력>> ");
			str[i] = sc.next();
		}
		
		System.out.println(str[0] + "보다는 " + str[1]);
	}
}
