package error_study;

//객체를 메소드로 넘기는 방법

public class test3 {
	int a; //객체 변수 a 선언
	
	public void vartest(test3 test) {
		test.a++;	// vartest 메소드는 test3 클래스의 객체를 입력받아 해당 객체의 객체변수 a의 값을 1 증가시키는 역할을 수행한다.
	}
	public static void main(String[] args) {
		test3 myTest=new test3();
		myTest.a=1;
		myTest.vartest(myTest);
		System.out.println(myTest.a);
		// main 메소드에서는 vartest 메소드에 test3 클래스의 객체인 myTest를 넘기도록 한다.(이 과정에서 1이 넘어감)
	}
}

// vartest 메소드의 입력 파라미터는 값 1이 아닌, test3 클래스의 객체 자체이다.