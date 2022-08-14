package application;

import model.StaticCircle;

public class TestStaticCircle {
	
	public static void main(String[] args) {
		StaticCircle c1 =new StaticCircle();
		StaticCircle c2 =new StaticCircle();
		StaticCircle c3 =new StaticCircle();
		
		System.out.println("get number:"+c1.getNumberOfObjects());
		c1.setNumberOfObjects(-10);
		System.out.println("get number after int native:"
				+ ""+c1.getNumberOfObjects());
		c1.setNumberOfObjects(50);
		System.out.println("get number after int positive:"
				+ ""+c1.getNumberOfObjects());
		StaticCircle c4 =new StaticCircle();
		System.out.println("get number after:"
				+ ""+c1.getNumberOfObjects());
	}
}
