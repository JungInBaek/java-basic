package useclass;

import makeclass.Calculator;

public class UseCalculator {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.add(200, 100);
		double result2 = calc.add(100, 22.2);
		double result3 = calc.add(11.1, 22.2);
		String result4 = calc.add("응애", 1);
		int result5 = calc.multi(3000, 4);
		int result6 = calc.div(result5, 4);
		
		System.out.println("더한 값1은 " + result);
		System.out.println("더한 값2는 " + result2);
		System.out.println("더한 값3은 " + result3);
		System.out.println("더한 값4는 " + result4);
		System.out.println("곱한 값5는 " + result5);
		System.out.println("나눈 값6은 " + result6);
	}

}
