package repeat;

public class ForPractice2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			//	1부터 1씩 증가하면서 10까지 처리
			System.out.println(i);
			sum += i;
		}
		System.out.println("=================");
		System.out.println("합계 : " + sum);
		System.out.println("=================");
		
		sum = 0;
		for (int i = 3; i <= 11; i++) {
			System.out.println(i);
			sum += i;
		}		
		System.out.println("=================");
		System.out.println("합계 : " + sum);
		System.out.println("=================");
	}

}
