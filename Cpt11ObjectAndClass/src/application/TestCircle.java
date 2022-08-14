package application;

import model.Circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(25);
		Circle circle3 = new Circle(125);
		
		System.out.println("circle1==="+circle1.getArea());
		System.out.println("circle2==="+circle2.getArea());
		System.out.println("circle3==="+circle3.getArea());
		
		circle2.radius= 100;
		System.out.println("circle2==="+circle2.getArea());
		
		//new Circle().getArea()=>匿名對象
		System.out.println("circlenew==="+new Circle().getArea());

	}

}
