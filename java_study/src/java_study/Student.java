package java_study;
<<<<<<< HEAD
import java.util.Scanner;
=======

import java.util.Vector;
>>>>>>> e37bc178204f5f55ca46b39e402e0bb8825e080b

//soorim

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
		
		Student s1 = new Student("ï¿½Ú½Ã¿ï¿½","2010/02/03","ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½",200000,"2010112081");
		Student s2 = new Student("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½","2010/10/20","ï¿½ß±ï¿½",200000,"2010112082");
		Student s3 = new Student("ï¿½Ñ¿ï¿½ï¿½ï¿½","2011/11/11","ï¿½ï¿½ê±¸",400000,"2010112083");
		Student s4 = new Student("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½","2010/07/21","ï¿½Ï³ï¿½ï¿½ï¿½",400000,"2010112084");
		Student s5 = new Student("ï¿½Ú»ï¿½ï¿½ï¿½","2010/10/02","Ã»ï¿½ï¿½ï¿½ï¿½",500000,"2010112085");
		
<<<<<<< HEAD
		System.out.println("GPA È®ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ï´ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½Ï¼ï¿½ï¿½ï¿½.[ï¿½ï¿½: ï¿½Ú½Ã¿ï¿½]");
		Scanner sc = new Scanner(System.in);
		String who = sc.next();
=======
		Vector<Person> student = new Vector<Person>();
>>>>>>> e37bc178204f5f55ca46b39e402e0bb8825e080b
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		
		System.out.println("º¤ÅÍ¸¦ È°¿ëÇÑ studentÀÇ ÀÌ¸§ Ãâ·Â");
		for(int i=0; i<student.size(); i++) {
			System.out.println(student.get(i).personName);
		}
		
	}

}
