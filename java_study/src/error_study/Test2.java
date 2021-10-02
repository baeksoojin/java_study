package error_study;

public class Test2 {
		public void vartest(int a) {
			a++;
	}

	public static void main(String[] args) {
		int a=1;
		Test2 myTest = new Test2();
		myTest.vartest(a);
		System.out.println(a);	//출력=1, 이유:a는 로컬 변수이기 때문
	}
}

/*
만약 vartest의 입력값이 int 자료형이 아닌 객체였다면, a가 수정되어서 출력될 것이다.
이 방법은 test3에서 소개.
*/