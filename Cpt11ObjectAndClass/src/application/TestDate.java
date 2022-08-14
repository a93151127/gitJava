package application;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		//顯示當前時間戳
		System.out.println("當前時間戳:"+date.getTime());
		//顯示當前時間
		System.out.println("當前時間:"+date.toString());
		
	}

}
