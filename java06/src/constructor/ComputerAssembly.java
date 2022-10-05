package constructor;

public class ComputerAssembly {

	public static void main(String[] args) {
		Computer com1 = new Computer(2000000, "삼성", 27);
		Computer com2 = new Computer(1500000, "hp", 24);
		
		System.out.println("가격 = " + com1.price + ", 제조회사 = " + com1.company + ", 모니터 크기 = " + com1.monitorSize);
		System.out.println("가격 = " + com2.price + ", 제조회사 = " + com2.company + ", 모니터 크기 = " + com2.monitorSize);
		
		System.out.println(com1);
		System.out.println(com2);
	}

}
