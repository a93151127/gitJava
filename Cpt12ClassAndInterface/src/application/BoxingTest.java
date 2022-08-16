package application;

public class BoxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//實際上這邊等於Integer[] wrappedArray={1,2,3}=>這個為boxing
		Integer[] wrappedArray= {new Integer(1),new Integer(2),new Integer(3)};
		
		
		Integer[] intArray= {1,2,3};
		//實際上這邊的print out做了一個unboxing的動作
		System.out.println(intArray[0]+intArray[1]+intArray[2]);
	}

}
