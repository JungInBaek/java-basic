package inheritance;

public class WonderWoman extends Woman {
	
	boolean transform;

	public WonderWoman(String name, String gender, int look, boolean transform) {
		super(name, gender, look);
		this.transform = transform;
	}
	
	public void transform() {
		System.out.println("변신하다");
	}

	@Override
	public String toString() {
		return "WonderWoman [transform=" + transform + ", look=" + look + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
