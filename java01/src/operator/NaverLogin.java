package operator;

public class NaverLogin {

	public static void main(String[] args) {
		//	기본형 비교 여러개인 경우
		int id = 1111;
		int pw = 2222;
		
		int id2 = 1111;
		int pw2 = 2222;
		
		//	논리 연산자 (&&)
		if(id == id2 && pw == pw2) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
					}
	}

}
