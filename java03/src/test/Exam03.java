package test;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lastYear = new String[3];
		String[] thisYear = new String[3];
		
		for (int i = 0; i < lastYear.length; i++) {
			System.out.print("작년 장소 입력>> ");
			lastYear[i] = sc.next();
		}
		
		for (int i = 0; i < thisYear.length; i++) {
			System.out.print("올해 장소 입력>> ");
			thisYear[i] = sc.next();
		}
		
		int sum = 0;
		for (int i = 0; i < thisYear.length; i++) {
			if (lastYear[i].equals(thisYear[i])) {
				sum++;
			}
		}
		
		System.out.println("결과 : " + sum + "곳");
	}

}
