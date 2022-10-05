package inheritance;

public class Staff {

	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}
