package java_study;

import java.util.Vector;

public class Student extends Person {
	
	String studentID;
	double GPA;
	public Student(String name, String date, String address, double gpa, String id) {
		super(name,date,address);
		this.studentID = id;
		this.GPA = gpa;
	}
	
	public int getGPA() {
		return (int)this.GPA;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("박시원","2010/02/03","마포구",200000,"2010112081");
		Student s2 = new Student("조지희","2010/10/20","중구",200000,"2010112082");
		Student s3 = new Student("한운희","2011/11/11","용산구",400000,"2010112083");
		Student s4 = new Student("백진희","2010/07/21","하남시",400000,"2010112084");
		Student s5 = new Student("박상혁","2010/10/02","청량리",500000,"2010112085");
		
		Vector<Person> student = new Vector<Person>();
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		
		System.out.println("벡터를 활용한 student의 이름 출력");
		for(int i=0; i<student.size(); i++) {
			System.out.println(student.get(i).personName);
		}
		
	}

}
