package inheritance;

public class UserPerson {

	public static void main(String[] args) {
		Person p = new Person("클라크", "남자");
		System.out.println(p);
		
		Man m = new Man("클라크", "남자", 100);
		System.out.println(m);
		
		SuperMan sm = new SuperMan("클라크", "남자", 200, true);
		System.out.println(sm);
		
		WonderWoman ww = new WonderWoman("줄리아", "여자", 150, true);
		System.out.println(ww);
	}
	
}
