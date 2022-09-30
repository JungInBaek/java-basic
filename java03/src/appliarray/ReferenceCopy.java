package appliarray;

public class ReferenceCopy {

	public static void main(String[] args) {
		
		// 참조형 복사(얕은 복사)
		int[] num1 = { 100, 200, 300 };
		int[] num2 = num1;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		int[] num3 = num1.clone();
		System.out.println("num1: " + num1);
		System.out.println("num3: " + num3);
		System.out.println("변경 전 ===========================");
		for (int i : num1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : num3) {
			System.out.print(i + " ");
		}
		System.out.println("\n변경 후 ===========================");
		num3[0] = 999;
		for (int i : num1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : num3) {
			System.out.print(i + " ");
		}
	}

}
