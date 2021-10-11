package java_study;
import java.util.Scanner;

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
		
		Employee e1 = new Employee("�����","2000/02/03","������",3000000,"20191121");
		Employee e2 = new Employee("�̼���","2000/10/20","�߱�",3100000,"20191122");
		Employee e3 = new Employee("�Ѽ�ȣ","2000/11/11","��걸",33000000,"20191123");
		Employee e4 = new Employee("������","2000/07/21","�ϳ���",2300000,"20191124");
		Employee e5 = new Employee("�����","2000/10/02","û����",5000000,"20191125");
		
		System.out.println("�޿�Ȯ���� ���ϴ� ����� �Է��ϼ���.[��: �����]");
		Scanner sc = new Scanner(System.in);
		String who = sc.next();
		
		
		if(e1.personName.equals(who)) {
			System.out.println(who + " : "+e1.getMonthlySalary());
		}
		else if(e2.personName.equals(who))
		{
			System.out.println(who + " : "+e2.getMonthlySalary());
		}
		else if(e3.personName.equals(who))
		{
			System.out.println(who + " : "+e3.getMonthlySalary());
		}
		else if(e4.personName.equals(who))
		{
			System.out.println(who + " : "+e4.getMonthlySalary());
		}
		else{
			System.out.println(who + " : "+e5.getMonthlySalary());
		}
		
		
		sc.close();
	}
	
}
