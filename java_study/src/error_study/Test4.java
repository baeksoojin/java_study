package error_study;

public class Test4 {
	int a;
	
	public void vartest() {
		this.a++;	// this�� �̿��� vartest�� �����Ѵ�. �� ���, ���� �޼ҵ忡�� myTest ��ü�� vartest �޼ҵ忡 ���������� �ʾƵ� �ȴ�.
	}

	public static void main(String[] args) {
		Test4 myTest=new Test4();
		myTest.a=1;
		myTest.vartest();
		System.out.println(myTest.a);
	}

}
