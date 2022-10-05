package inheritance;

public class SuperMan extends Man {
	
	boolean fly;

	public SuperMan(String name, String gender, int size, boolean fly) {
		super(name, gender, size);
		this.fly = fly;
	}
	
	@Override
	public void eat() {
		System.out.println("많이 먹다");
	}
	
	public void fly() {
		System.out.println("날아다니다");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", size=" + size + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
