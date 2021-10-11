package java_study;
import java.util.Scanner;

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
		
		Student s1 = new Student("�ڽÿ�","2010/02/03","������",200000,"2010112081");
		Student s2 = new Student("������","2010/10/20","�߱�",200000,"2010112082");
		Student s3 = new Student("�ѿ���","2011/11/11","��걸",400000,"2010112083");
		Student s4 = new Student("������","2010/07/21","�ϳ���",400000,"2010112084");
		Student s5 = new Student("�ڻ���","2010/10/02","û����",500000,"2010112085");
		
		System.out.println("GPA Ȯ���� ���ϴ� ����� �Է��ϼ���.[��: �ڽÿ�]");
		Scanner sc = new Scanner(System.in);
		String who = sc.next();
		
		
		if(s1.personName.equals(who))
			System.out.println(s1.getGPA());
		if(s2.personName.equals(who))
			System.out.println(s2.getGPA());
		if(s3.personName.equals(who))
			System.out.println(s3.getGPA());
		if(s4.personName.equals(who))
			System.out.println(s4.getGPA());
		if(s5.personName.equals(who))
			System.out.println(s5.getGPA());
		
		sc.close();
	}

}
