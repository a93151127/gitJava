package package1;

public class TestPackage2 {
	void aMethod() {
		/*
		 * package 只要是在同一個package中都可以被訪問
		 */
		
		
		TestPackage1 p = new TestPackage1();
		//public
		int a= p.x;
		//package
		int y=p.y;
		//z為private故不可訪問
//		int z=p.z;
		
		//public
		p.m1();
		//package
		p.m2();
		//m3為private故不可訪問
//		p.m3();
	}
}
