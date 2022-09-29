package basicArray;

public class MakeArray2 {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		System.out.println("num의 주소>> " + num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		for (int i : num) {
			System.out.println(num[i]);
		}
	}

}
