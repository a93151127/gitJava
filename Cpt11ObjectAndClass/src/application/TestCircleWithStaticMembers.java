package application;

import model.CircleWithStaticMembers;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		CircleWithStaticMembers c1 =new CircleWithStaticMembers();
		System.out.println(CircleWithStaticMembers.getNumberOfObject());
		System.out.println(c1.getNumberOfObjectWithourStatic());
		
		CircleWithStaticMembers c2 =new CircleWithStaticMembers();
		
		CircleWithStaticMembers c3 =new CircleWithStaticMembers();
		System.out.println(CircleWithStaticMembers.getNumberOfObject());
		System.out.println(c1.getNumberOfObjectWithourStatic());

	}

}
