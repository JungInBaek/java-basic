package constructor;

public class CreateAccount {

	public static void main(String[] args) {
		Account dad = new Account("홍길동", "050505", 10000);
		System.out.println(dad.name);
		System.out.println(dad.ssn);
		System.out.println(dad.money);
	}

}
