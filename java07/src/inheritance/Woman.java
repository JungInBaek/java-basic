package inheritance;

public class Woman extends Person {
	
	int look;
	

	public Woman(String name, String gender, int look) {
		super(name, gender);
		this.look = look;
	}

	public void makeUp() {
		System.out.println("화장한다");
	}
	
	@Override
	public String toString() {
		return "Woman [look=" + look + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
