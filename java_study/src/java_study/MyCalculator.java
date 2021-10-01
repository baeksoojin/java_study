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
	
	//정적메소드를 사용한 경우 객체 선언이 필요없음.

	
	public static void main(String[] args) {
		MyCalculator mycal = new MyCalculator();
		int b = mycal.min(1,2);
		//정적메소드를 사용하지 않은 경우 객체선언이 필요함.
		System.out.println("더하기 : "+ mycal.a);
		System.out.println("빼기 : "+b);
		
	}
	
	
}
