package java_study;

import java.util.*;

public class Employee extends Person{
	
	String employeeID;
	int monthlySalary;
	
	public Employee(String name, String date, String address, int salary, String id) {
		super(name,date,address);
		this.monthlySalary = salary;
		this.employeeID = id;
		
	}
	
	public int getMonthlySalary() {
		return this.monthlySalary;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("김수진","2000/02/03","마포구",3000000,"20191121");
		Employee e2 = new Employee("이수정","2000/10/20","중구",3100000,"20191122");
		Employee e3 = new Employee("한수호","2000/11/11","용산구",33000000,"20191123");
		Employee e4 = new Employee("박진야","2000/07/21","하남시",2300000,"20191124");
		Employee e5 = new Employee("백수진","2000/10/02","청량리",5000000,"20191125");
		
		Vector<Person> employee = new Vector<Person>();
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		
		System.out.println("벡터를 활용한 employee의 이름 출력");
		for(int i=0; i<employee.size(); i++) {
			System.out.println(employee.get(i).personName);
		}
		
		
	}
	
}
