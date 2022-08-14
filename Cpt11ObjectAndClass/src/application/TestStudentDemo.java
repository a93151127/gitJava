package application;

import java.util.Date;

public class TestStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		StudentDemo s = new StudentDemo(1111,"martin",date);
		
		System.out.println(s.getDateCreated());
		Date dateCreated=s.getDateCreated();
		dateCreated.setTime(2000);
		System.out.println(s.getDateCreated());
	}
	
}

class StudentDemo{
	private int id;
	private String name;
	private Date dateCreated;
	public StudentDemo(int id, String name,Date date) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreated =date;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	
}