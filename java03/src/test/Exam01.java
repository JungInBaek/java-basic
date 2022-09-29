package test;

public class Exam01 {

	public static void main(String[] args) {
		// 1
		int[] five = new int[5];

		// 2
		System.out.println(five.length);

		// 3
		five[0] = 100;
		System.out.println(five[0]);

		// 4
		five[five.length - 1] = 500;
		System.out.println(five[five.length - 1]);

		// 5
		five[2] = 200;
		System.out.println(five[2]);

		// 6
		for (int i : five) {
			System.out.println(i);
		}

		// 7
		for (int i = 0; i < five.length; i++) {
			System.out.println("five[" + i + "] = " + five[i]);
		}
	}

}
