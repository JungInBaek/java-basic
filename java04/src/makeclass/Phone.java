package makeclass;

public class Phone {
	// 공통적인 성질: 사이즈, 스피커
	// ==> 변수를 사용, 2개의 변수 필요
	// ==> 멤버변수
	private int size;
	private String speaker;
	
	public Phone() {};
	
	public Phone(int size, String speaker) {
		this.size = size;
		this.speaker = speaker;
	}

	// 동작(기능)을 정의: 통화하다, 사진을 찍다
	public void call() {
		System.out.println("통화 중");
	}
	
	public void takePicture() {
		System.out.println("찰칵");
	}
}
