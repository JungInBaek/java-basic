package sequential;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class ConsolePractice {

	public static void main(String[] args) {
		// 콘솔뷰 Scanner 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력 : ");
		String name = sc.next();
		System.out.println("입력받은 이름은 " + name + "입니다.");
		
		System.out.print("소속을 입력 : ");
		String com = sc.next();
		System.out.println("입력받은 소속은 " + com + "입니다.");
	}

}
