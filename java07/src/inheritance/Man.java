package inheritance;

public class Man extends Person{
	
	int size;
	
	public Man() {}	

	public Man(String name, String gender, int size) {
		super(name, gender);
		this.size = size;
	}

	public void run() {
		System.out.println("빨리 달리다");
	}

	@Override
	public String toString() {
		return "Man [size=" + size + ", name=" + name + ", gender=" + gender + "]";
	}
}
