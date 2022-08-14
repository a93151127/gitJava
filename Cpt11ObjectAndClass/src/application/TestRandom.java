package application;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//括號裡面的數字或空白為取隨機數時的基數
		Random random1 = new Random(3);
		System.out.println("From random1: ");
		for(int i =0;i<10;i++) {
			System.out.print(random1.nextInt(1000)+",");
		}
		Random random2 = new Random(3);
		System.out.println("");
		System.out.println("From rando2: ");
		for(int i =0;i<10;i++) {
			System.out.print(random2.nextInt(1000)+",");
		}
		Random random3 = new Random();
		System.out.println("");
		System.out.println("From rando3: ");
		for(int i =0;i<10;i++) {
			System.out.print(random3.nextInt(1000)+",");
		}
	}

}
