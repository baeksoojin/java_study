
package java_study;

public class Staff {

	
	public String name;
	//public이기때문에 어디서든 사용가능.
	
	private double salary;
	//private이기때문에 Staff class에서만 사용가능.
	
	public Staff(String stfname) {
		name = stfname;
	}
	
	public void setSalary(double stfSal) {
		salary = stfSal;
	}
	
	public void printstf() {
		System.out.println("이름 : "+name);
		System.out.println("급여 : "+salary);
	}
	
	public static void main(String args[]) {
		
		System.out.println("다음은 인스턴스 변수에 대한 예제 코드입니다.");
		Staff stfone = new Staff("백수진");
		//class선언과 동시에 인스턴스변수 매개변수를 넣어줌
		stfone.setSalary(10000);
		stfone.printstf();
	}
	
	
}
