
package java_study;

public class Staff {

	
	public String name;
	//public�̱⶧���� ��𼭵� ��밡��.
	
	private double salary;
	//private�̱⶧���� Staff class������ ��밡��.
	
	public Staff(String stfname) {
		name = stfname;
	}
	
	public void setSalary(double stfSal) {
		salary = stfSal;
	}
	
	public void printstf() {
		System.out.println("�̸� : "+name);
		System.out.println("�޿� : "+salary);
	}
	
	public static void main(String args[]) {
		
		System.out.println("������ �ν��Ͻ� ������ ���� ���� �ڵ��Դϴ�.");
		Staff stfone = new Staff("�����");
		//class����� ���ÿ� �ν��Ͻ����� �Ű������� �־���
		stfone.setSalary(10000);
		stfone.printstf();
	}
	
	
}
