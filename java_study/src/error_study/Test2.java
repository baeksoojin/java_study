package error_study;

public class Test2 {
		public void vartest(int a) {
			a++;
	}

	public static void main(String[] args) {
		int a=1;
		Test2 myTest = new Test2();
		myTest.vartest(a);
		System.out.println(a);	//���=1, ����:a�� ���� �����̱� ����
	}
}

/*
���� vartest�� �Է°��� int �ڷ����� �ƴ� ��ü���ٸ�, a�� �����Ǿ ��µ� ���̴�.
�� ����� test3���� �Ұ�.
*/