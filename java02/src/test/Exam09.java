package test;

public class Exam09 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 1000; i += 3) {
			if(sum > 100) {
				System.out.println("더하기 종료");
				break;
			} else if(i % 5 == 0){
				System.out.println("5의 배수는 더하지 않습니다.");
			} else {
				sum += i;
			}
		}
		
		System.out.println("합계 : " + sum);
	}
}
