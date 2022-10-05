package inheritance;

public class Person {

	String name;
	String gender;
	
	public Person() {}
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public void sleep() {
		System.out.println("잠자다");
	}
	
	public void eat() {
		System.out.println("먹다");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
}
