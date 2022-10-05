package makeclass;

public class Dog {

	private String name;
	private String type;
	private String color;
	private int age;
	private double weight;

	public Dog() {
	}

	public Dog(String name, String type, String color, int age, double weight) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}

	public void bark() {
		System.out.println("멍멍!");
	}

	public void wagTail() {
		System.out.println("살랑살랑~");
	}

	public void eat() {
		System.out.println("쭈압쭈압");
	}

	public void sleep() {
		System.out.println("Zzz");
	}
}
