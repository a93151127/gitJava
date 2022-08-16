package model;

public class Course {
	private String courseName;
	private String[] students=new String[100];
	private static int numberOfStudents;
	
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent(String student) {
		
	}
}
