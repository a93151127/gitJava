package application;

import model.Course;

public class TestCourse {

	public static void main(String[] args) {
		Course c1 = new Course("java");
		c1.addStudent("martin");
		c1.addStudent("abi");
		c1.addStudent("soon");
		
		System.out.println("Number Of Students in c1:"+c1.getNumberOfStudents());
		
		String[] studentInC1 = c1.getStudents();
		
		for(int i=0;i<c1.getNumberOfStudents();i++) {
			System.out.print(studentInC1[i]+",");
		}
		System.out.println("");
		System.out.println("===========");
		
		c1.addStudent("welson");
		for(int i=0;i<c1.getNumberOfStudents();i++) {
			System.out.print(studentInC1[i]+",");
		}

	}

}
