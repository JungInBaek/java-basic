package constructor;

public class Account {
	//	멤버변수, 글로벌변수
	String name;	//	사람이름
	String ssn;		//	주민번호
	int money;
	
	public Account(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	
}
