package error_study;

public class Test4 {
	int a;
	
	public void vartest() {
		this.a++;	// this를 이용해 vartest에 접근한다. 이 경우, 메인 메소드에서 myTest 객체를 vartest 메소드에 전달해주지 않아도 된다.
	}

	public static void main(String[] args) {
		Test4 myTest=new Test4();
		myTest.a=1;
		myTest.vartest();
		System.out.println(myTest.a);
	}

}
