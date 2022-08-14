package application;

import model.StaticCircle;

public class TestCircleArray {

	public static void main(String[] args) {
		StaticCircle[] scArray = new StaticCircle[10];
		
		System.out.println(StaticCircle.getNumberOfObjects());
		
		for(int i =0;i<10;i++) {
			scArray[i] = new StaticCircle();
		}
		
		System.out.println(StaticCircle.getNumberOfObjects());

	}

}
