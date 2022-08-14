package package2;

import package1.TestPackage1;

public class TestPackage3 {
	void aMethod() {
		/*
		 * private只能在同一個package中才能被訪問
		 */
		TestPackage1 p = new TestPackage1();
		//public
		int a = p.x;
		//因為在不同package故不可訪問y
//		int b = p.y;
		//private
//		int c = p.z;
		
		p.m1();
		//z為private故不可訪問
//		p.m2();
		//private
//		p.m3();
	}
}
