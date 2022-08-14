package application;

import model.Circle;

public class TestPassValueOrReference {

	public static void main(String[] args) {
		int n =5;
		Circle c = new Circle();
		
		getArea(c,n);
		
		System.out.println("c:"+c.getRadius());
		System.out.println("n:"+n);

	}
	
	static void getArea(Circle c, int n) {
		
		while(n>=1) {
			System.out.println("Radius:"+c.getRadius()+"\tArea:"+c.getArea());
			n--;
			c.setRadius(c.getRadius()+1);
		}
	}
}
