package error_study;

// soorim 
public class Student extends Person {
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
		
		Student st1=new Student("윤수림", "2001/01/19", "서울시 강서구", 4.5, "2019112091");
		Student st2=new Student("이선화", "2000/08/25", "서울시 강남구", 3.8, "2019203192");
		Student st3=new Student("최은애", "2000/10/10", "서울시 마포구", 2.9, "2019294817");
		Student st4=new Student("김민채", "2002/12/12", "서울시 관악구", 4.1, "2019394482");
		Student st5=new Student("한승미", "2000/09/30", "서울시 노원구", 3.2, "2019110119");
		
		System.out.println("----------Student----------");
		double compute_gpa=(st1.getGPA()+st2.getGPA()+st3.getGPA()+st4.getGPA()+st5.getGPA())/5;
		System.out.println("평균 학점(GPA): "+compute_gpa+"\n");
		
		System.out.println("----------Student 정보----------");
		st1.print();
		st2.print();
		st3.print();
		st4.print();
		st5.print();
	}
}
