package useclass;

import makeclass.Dog;
import makeclass.Phone;

public class MyRoom {
	
	public static void main(String[] args) {
		Phone phone = new Phone(12, "JBL");
		phone.call();
		Dog dog = new Dog("알라", "골든리트리버", "황색", 2, 34.1);
		dog.bark();
	}
}
