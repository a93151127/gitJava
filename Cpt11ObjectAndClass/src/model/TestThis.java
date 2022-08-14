package model;

public class TestThis {
	private double radius = 1.0;

	public TestThis(double radius) {
		super();
		this.radius = radius;
		System.out.println("inside TestThis(raduis)");
	}

	public TestThis() {	
		//此處的this是呼叫上面那個constructor,只能放在最前面並且不能和super()一起
		this(5.0);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
