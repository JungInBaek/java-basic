package appliarray;

public class PrimitiveCopy {

	public static void main(String[] args) {
		
		// 기본데이터를 다른 변수에 복사
		int math1 = 100;
		int math2 = math1;	// 복사
		System.out.println("수학1: " + math1);
		System.out.println("수학2: " + math2);
		
		math2 = 90;
		System.out.println("수학1: " + math1);
		System.out.println("수학2: " + math2);
	}

}
