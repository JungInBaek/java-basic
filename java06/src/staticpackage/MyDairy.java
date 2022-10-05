package staticpackage;

public class MyDairy {

	public static void main(String[] args) {
		Day day1 = new Day(10, "강남역", "자바공부");
		System.out.println(day1);
		System.out.println(Day.count + "일 째");
		
		Day day2 = new Day(15, "강원도", "여행");
		System.out.println(day2);
		System.out.println(Day.count + "일 째");
		
		Day day3 = new Day(11, "피트니스", "운동");
		System.out.println(day3);
		System.out.println(Day.count + "일 째");
	}

}
