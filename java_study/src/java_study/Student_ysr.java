package java_study;

import java.util.Vector;

public class Student_ysr extends Person_ysr {
	String studentID; //10자리로 구성
	double GPA;
	
	public Student(String name, String date, String address, double gpa, String id) {
		super(name, date, address);
		
		setGPA(GPA);
		setStudentID(studentID);
		
		this.GPA=gpa;
		this.studentID=id;
	}
	
	public void print() {
		System.out.println("<"+getName()+"의 정보>");
		System.out.println("이름: "+this.personName+"\n생일: "+this.birthDate+"\n주소: "+this.homeAddress+"\n학점: "+this.GPA+"\nID: "+this.studentID+"\n");
	}
	
	double getGPA() {
		return GPA;
	}
	
	void setGPA(double newGPA) {
		GPA=newGPA;
	}
	
	String getStudentID() {
		return studentID;
	}
	
	void setStudentID(String newID) {
		studentID=newID;
	}
	
	public static void main(String[] args) {
		
		Student st1=new Student("윤수림", "2001/01/19", "서울시 강서구", 4.3, "2019112091");
		Student st2=new Student("이선화", "2000/08/25", "서울시 강남구", 3.8, "2019203192");
		Student st3=new Student("김민채", "2002/12/12", "서울시 관악구", 2.9, "2019394482");
		Student st4=new Student("최은애", "2000/10/10", "서울시 마포구", 4.1, "2019294817");
		Student st5=new Student("한승미", "2000/09/30", "서울시 노원구", 3.4, "2019110119");
		
		System.out.println("----------Student----------");
		double compute_gpa=(st1.getGPA()+st2.getGPA()+st3.getGPA()+st4.getGPA()+st5.getGPA())/5;
		System.out.println("평균 학점(GPA): "+compute_gpa+"\n");
		
		System.out.println("----------Student 정보----------");
		st1.print();
		st2.print();
		st3.print();
		st4.print();
		st5.print();
		
		// 과제 5 추가
		//Vector<Student> v=new Vector<Student>();
		Vector<Person> v=new Vector<Person>();	//Student(Person?)를 저장할 벡터를 생성한 뒤, 5명의 Student(Person?) 객체를 저장
		v.add(st1);
		v.add(st2);
		v.add(st3);
		v.add(st4);
		v.add(st5);
		
		// 전체 드래그하고 control+/ : 해당 영역 주석
//		Student[] arr=new Student[v.size()];	//배열 객체를 생성하고 메모리를 할당한다.
//		v.copyInto(arr);	//copyInto 메소드를 활용해서 배열에 객체를 저장한다.
//		
//		System.out.println("===============과제 5================");
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i].getName()+", "+arr[i].getBirthDate()+", "+arr[i].gethomeAddress()+", "+arr[i].getGPA()+", "+arr[i].getStudentID());
//		}
//		System.out.println("===================================");
		
		System.out.println("===============과제 5================");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i).getName());
		}
		System.out.println("===================================");
	}
}
