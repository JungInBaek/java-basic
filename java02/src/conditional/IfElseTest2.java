package conditional;

public class IfElseTest2 {

	public static void main(String[] args) {
		int score = 88;
		String result = "";
		
		if (score >= 90) {
			result = "A";
		} else if (score >= 85) {
			result = "B+";			
		} else if (score >= 80) {
			result = "B-";			
		} else if (score >= 75) {
			result = "C+학점";
		} else if (score >= 70) {
			result = "C-학점";
		} else {
			result = "D학점";
		}
		
		System.out.println("당신의 학점은 " + result);
	}

}
