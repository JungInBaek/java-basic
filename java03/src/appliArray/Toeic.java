package appliArray;

import java.util.Random;

public class Toeic {

	public static void main(String[] args) {
		Random random = new Random();
		int[] answer = new int[990];
		int[] myAnswer = new int[990];
		
		System.out.print("  answer = [ ");
		for (int i = 0; i < answer.length; i++) {
			answer[i] = random.nextInt(4) + 1;
			System.out.print(answer[i]);
			if(i + 1 == answer.length) {
				System.out.print(" ]");
			} else {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.print("myAnswer = [ ");
		for (int i = 0; i < myAnswer.length; i++) {
			myAnswer[i] = random.nextInt(4) + 1;
			System.out.print(myAnswer[i]);
			if(i + 1 == myAnswer.length) {
				System.out.print(" ]");
			} else {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		int sum = 0;
		for (int i = 0; i < myAnswer.length; i++) {
			if (answer[i] == myAnswer[i]) {
				sum++;
			}
		}
		System.out.println("점수 : " + sum);
	}

}
