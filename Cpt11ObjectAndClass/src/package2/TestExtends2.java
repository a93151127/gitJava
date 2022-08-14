package package2;

import package1.TestPackage1;

public class TestExtends2 extends TestPackage1{
	void aMethod() {
		/*
		 * protected只要在不同package的子類中不可被訪問
		 */
		TestPackage1 p = new TestPackage1();
		
		//protected
//		int b=p.w;
		//protected
//		p.m4();
		
	}
}
