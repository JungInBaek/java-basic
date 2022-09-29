package appliArray;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		// 1. 1000개 공간 생성
		int[] lotto = new int[1000];
		
		// 2. 랜덤 생성
		Random r = new Random();
		
		// 3. 반복문으로 랜덤값 배열에 대입
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		
		// 4. 1000개 프린트
		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}

}
