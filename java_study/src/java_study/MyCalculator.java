package java_study;

public class MyCalculator {
	public static String appName = "MyCalculator";
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public int min(int x, int y) {
		return x-y;
	}
	
	int a = MyCalculator.add(1,2);
	
	//�����޼ҵ带 ����� ��� ��ü ������ �ʿ����.

	
	public static void main(String[] args) {
		MyCalculator mycal = new MyCalculator();
		int b = mycal.min(1,2);
		//�����޼ҵ带 ������� ���� ��� ��ü������ �ʿ���.
		System.out.println("���ϱ� : "+ mycal.a);
		System.out.println("���� : "+b);
		
	}
	
	
}
