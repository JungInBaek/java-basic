package test;

public class Exam08 {

	public static void main(String[] args) {
		int sum = 0;
		//	첫번째
		for(int i = 33; i <= 222; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		
		sum = 0;
		//	두번째
		for(int i = 55; i <= 4500; i += 2) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		
		sum = 0;
		//	세번째
		for(int i = 0; i <= 6000; i += 5) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
	}

}
