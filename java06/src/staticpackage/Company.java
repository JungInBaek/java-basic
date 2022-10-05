package staticpackage;

public class Company {

	public static void main(String[] args) {
		Staff s1 = new Staff("홍길동", "남", 26);
		Staff s2 = new Staff("김길동", "여", 24);
		Staff s3 = new Staff("송길동", "여", 25);
		
		System.out.println("우리 회사의 직원수는? : " + Staff.count);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		Staff.getAvg();
	}

}
