//05-2 �޼ҵ�
package error_study;
//�޼ҵ� ���� 1~4

public class Test {
	//1.�Է°� ���(���ϰ�)�� ��� �ִ� �޼ҵ�
	public int sum(int a, int b) {
		return a+b;
	}
	//2.�Է��� ���� ���(���ϰ�)�� �ִ� �޼ҵ�
	public String say() {
		return "2Hi";
	}
	//3.�Է°� ���(���ϰ�)�� ��� ���� �޼ҵ�
	public void sayHi() {
		System.out.println("3Hi");
	}
	
	//4.�Է��� �ְ� ���(���ϰ�)�� ���� �޼ҵ�
	public void sumN(int a, int b) {
		System.out.println(a+"�� "+b+"�� ���� "+(a+b)+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
		int a=3;
		int b=4;
		
		Test myTest=new Test(); //Ŭ������ ������������̸� = new Ŭ������();
		int c = myTest.sum(a,b);
		System.out.println(c);	//1
		
		String say=myTest.say();
		System.out.println(say);	//2
		
		myTest.sayHi();	//3.�Է°��� ���ϰ��� ��� ���� �޼ҵ�� "��ü.�޼ҵ��()"�� ���� ���ȴ�.
				
		myTest.sumN(a, b);	//4
	}
}
