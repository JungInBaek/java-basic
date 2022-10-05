package constructor;

public class Computer {
	
	int price;
	String company;
	int monitorSize;
	
	public Computer(int price, String company, int monitorSize) {
		this.price = price;
		this.company = company;
		this.monitorSize = monitorSize;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", company=" + company + ", monitorSize=" + monitorSize + "]";
	}
}
