package model;

public class StaticCircle {
	
	public double radius = 1.0;
	
	private static int numberOfObjects = 0;

	public StaticCircle(double radius) {
		super();
		this.radius = radius;
		numberOfObjects++;
	}

	public StaticCircle() {
		super();
		numberOfObjects++;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public static void setNumberOfObjects(int numberOfObjectsFromOther) {
		if(numberOfObjectsFromOther>=0) {
			numberOfObjects=numberOfObjectsFromOther;
		}
	
	}
}
