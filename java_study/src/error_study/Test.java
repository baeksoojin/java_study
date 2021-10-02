//05-2 메소드
package error_study;
//메소드 종류 1~4

public class Test {
	//1.입력과 출력(리턴값)이 모두 있는 메소드
	public int sum(int a, int b) {
		return a+b;
	}
	//2.입력은 없고 출력(리턴값)은 있는 메소드
	public String say() {
		return "2Hi";
	}
	//3.입력과 출력(리턴값)이 모두 없는 메소드
	public void sayHi() {
		System.out.println("3Hi");
	}
	
	//4.입력은 있고 출력(리턴값)은 없는 메소드
	public void sumN(int a, int b) {
		System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
	}
	
	public static void main(String[] args) {
		int a=3;
		int b=4;
		
		Test myTest=new Test(); //클래스명 내가쓰고싶은이름 = new 클래스명();
		int c = myTest.sum(a,b);
		System.out.println(c);	//1
		
		String say=myTest.say();
		System.out.println(say);	//2
		
		myTest.sayHi();	//3.입력값과 리턴값이 모두 없는 메소드는 "객체.메소드명()"과 같이 사용된다.
				
		myTest.sumN(a, b);	//4
	}
}
