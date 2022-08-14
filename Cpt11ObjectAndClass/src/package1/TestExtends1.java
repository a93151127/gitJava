package package1;

public class TestExtends1 extends TestPackage1{
	void aMethod() {
		/*
		 * protected只要在同一個package的子類中都可以被訪問
		 */
		TestPackage1 p = new TestPackage1();
		
		int b=p.w;
		
		p.m4();
		
	}
}
