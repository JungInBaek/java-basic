package constructor;

public class UseMask {

	public static void main(String[] args) {
		//	객체 생성 후, 멤버변수 값을 나중에 넣어도 되는 경우
		Mask m = new Mask();
		m.color = "흰색";
		m.price = 1000;
		m.count = 1;
		
		Mask m1 = new Mask("검정색", 2500, 2);
		System.out.println(m1);
	}
	
}
