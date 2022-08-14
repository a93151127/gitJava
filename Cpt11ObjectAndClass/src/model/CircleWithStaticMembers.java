package model;

public class CircleWithStaticMembers {
	double radius;
	
	//被建立了幾個物件
	static int numberOfObject=0;
	int numberOfObjectWithourStatic=0;

	public CircleWithStaticMembers() {
		radius=1.0;
		numberOfObject++;
		numberOfObjectWithourStatic++;
	}
	
	public static int getNumberOfObject() {
		return numberOfObject;
	}
	public int getNumberOfObjectWithourStatic() {
		return numberOfObjectWithourStatic;
	}
	
}
