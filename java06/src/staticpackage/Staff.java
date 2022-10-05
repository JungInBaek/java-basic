package staticpackage;

public class Staff {
	
	static int count;	//	직원 수
	static int sum;		//	직원 나이 합
	static double avg;	//	직원 평균 나이

	String name;
	String gender;
	int age;
	
	public Staff(String name, String gender, int age) {
		count++;
		sum += age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public static void getAvg() {
		avg = sum / count;
		System.out.println("평균 나이 : " + avg);
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
