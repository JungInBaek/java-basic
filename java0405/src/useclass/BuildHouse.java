package useclass;

import makeclass.BrickMold;

public class BuildHouse {

	public static void main(String[] args) {
		BrickMold brick1 = new BrickMold();
		brick1.stack();
		
		BrickMold brick2 = new BrickMold();
		brick2.stack();
		
		System.out.println(brick1);
		System.out.println(brick2);
	}

}
