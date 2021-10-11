package error_study;

// soorim

public class Employee extends Person {
	String employeeID; //8자리 숫자로 구성
	int monthlySalary;
	
	public Employee(String name, String date, String address, int salary, String id){	//employee의 생성자
		super(name, date, address);
		
		setMonthlySalary(monthlySalary);
		setEmployeeID(employeeID);
		
		this.monthlySalary=salary;
		this.employeeID=id;
	}
	
	public void print() {
		System.out.println("<"+getName()+"의 정보>");
		System.out.println("이름: "+this.personName+"\n생일: "+this.birthDate+"\n주소: "+this.homeAddress+"\n급여: "+ this.monthlySalary+"\nID: "+this.employeeID+"\n");
	}
	
	int getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(int newSalary) {
		monthlySalary=newSalary;
	}
	
	public void setEmployeeID(String newID) {
		employeeID=newID;
	}
	
	public static void main(String[] args) {
		
		Employee em1=new Employee("김세정", "1996/08/28", "서울시 중구", 8100000, "12345678");
		Employee em2=new Employee("이은비", "1995/01/30", "서울시 서초구", 6200000, "23456789");
		Employee em3=new Employee("박세진", "1994/02/17", "서울시 강북구", 9000000, "34567891");
		Employee em4=new Employee("정호준", "1999/11/01", "서울시 강동구", 5400000, "45678912");
		Employee em5=new Employee("강시아", "1997/03/28", "서울시 강서구", 3500000, "56789123");
		
		System.out.println("----------Employee----------");
		int compute_monthlySalary = em1.getMonthlySalary()+em2.getMonthlySalary()+em3.getMonthlySalary()+em4.getMonthlySalary()+em5.getMonthlySalary();
		System.out.println("평균 월급: "+compute_monthlySalary+"\n");
		
		System.out.println("----------Employee 정보----------");
		em1.print();
		em2.print();
		em3.print();
		em4.print();
		em5.print();
		
	}
}

