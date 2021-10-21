package java_study;
<<<<<<< HEAD
import java.util.Scanner;
=======

import java.util.*;
>>>>>>> e37bc178204f5f55ca46b39e402e0bb8825e080b

//soorim

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
		
		Employee e1 = new Employee("ï¿½ï¿½ï¿½ï¿½ï¿½","2000/02/03","ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½",3000000,"20191121");
		Employee e2 = new Employee("ï¿½Ì¼ï¿½ï¿½ï¿½","2000/10/20","ï¿½ß±ï¿½",3100000,"20191122");
		Employee e3 = new Employee("ï¿½Ñ¼ï¿½È£","2000/11/11","ï¿½ï¿½ê±¸",33000000,"20191123");
		Employee e4 = new Employee("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½","2000/07/21","ï¿½Ï³ï¿½ï¿½ï¿½",2300000,"20191124");
		Employee e5 = new Employee("ï¿½ï¿½ï¿½ï¿½ï¿½","2000/10/02","Ã»ï¿½ï¿½ï¿½ï¿½",5000000,"20191125");
		
<<<<<<< HEAD
		System.out.println("ï¿½Þ¿ï¿½È®ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ï´ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½Ï¼ï¿½ï¿½ï¿½.[ï¿½ï¿½: ï¿½ï¿½ï¿½ï¿½ï¿½]");
		Scanner sc = new Scanner(System.in);
		String who = sc.next();
=======
		Vector<Person> employee = new Vector<Person>();
>>>>>>> e37bc178204f5f55ca46b39e402e0bb8825e080b
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		
		System.out.println("º¤ÅÍ¸¦ È°¿ëÇÑ employeeÀÇ ÀÌ¸§ Ãâ·Â");
		for(int i=0; i<employee.size(); i++) {
			System.out.println(employee.get(i).personName);
		}
		
		
	}
	
}
