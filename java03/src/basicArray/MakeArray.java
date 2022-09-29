package basicArray;

public class MakeArray {

	public static void main(String[] args) {
		// 배열을 생성할 때, 값을 이미 알고 있는 경우
		int[] s = { 1, 2, 3, 4, 5, 6, 7 };
		// 변수의 개수 ==> 9개
		System.out.println("s에 저장된 주소>> " + s);
		System.out.println(s.length);
		
		// 배열을 생성할 때, 값을 아직 모르고 있는 경우
		int[] s2 = new int[5];
		//	변수의 개수 ==> 7개
		System.out.println("s2에 저장된 주소>> " + s2);
		System.out.println(s2.length);
	}

}
