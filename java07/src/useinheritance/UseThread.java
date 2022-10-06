package useinheritance;

public class UseThread {

	public static void main(String[] args) {
		CounterThread ct = new CounterThread();
		TimeThread tt = new TimeThread();
		ImgThread it = new ImgThread();
		
		ct.start();
		tt.start();
		it.start();
	}

}
