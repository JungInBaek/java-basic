package appliarray;

import java.util.Random;

public class Toeic2 {

	public static void main(String[] args) {
		// 1. 답안지, 대답안 공간
		int[] answer = new int[990];
		int[] myAnswer = new int[990];

		// 2. 랜덤 생성
		Random random = new Random();

		// 3. 990번 반복해서 답안지, 대답안에 숫자 대입
		for (int i = 0; i < myAnswer.length; i++) {
			answer[i] = random.nextInt(4) + 1;
			myAnswer[i] = random.nextInt(4) + 1;
		}

		// 4. 같은 인덱스끼리 990번 비교 (점수++)
		int sum = 0;
		for (int i = 0; i < myAnswer.length; i++) {
			if (answer[i] == myAnswer[i]) {
				sum++;
			}
		}
		
		// 5. 점수 출력
		System.out.println("내 점수 : " + sum);
	}

}
