package staticpackage;

public class Day {

	static int count;
	static int sum;
	static int avg;

	int time;
	String location;
	String doing;

	public Day(int time, String location, String doing) {
		count++;
		sum += time;
		avg = sum / count;
		this.time = time;
		this.location = location;
		this.doing = doing;
	}

	public static double getAvg() {
		return sum / (double) count;
	}

	@Override
	public String toString() {
		return "나의 하루 [시간=" + time + ", 위치=" + location + ", 한 일=" + doing + "]"
				+ "\n전체 하는 일의 시간 : " + sum
				+ "\n평균 하는 일의 시간 : " + avg;
	}

}
