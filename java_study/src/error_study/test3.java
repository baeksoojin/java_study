package error_study;

//��ü�� �޼ҵ�� �ѱ�� ���

public class test3 {
	int a; //��ü ���� a ����
	
	public void vartest(test3 test) {
		test.a++;	// vartest �޼ҵ�� test3 Ŭ������ ��ü�� �Է¹޾� �ش� ��ü�� ��ü���� a�� ���� 1 ������Ű�� ������ �����Ѵ�.
	}
	public static void main(String[] args) {
		test3 myTest=new test3();
		myTest.a=1;
		myTest.vartest(myTest);
		System.out.println(myTest.a);
		// main �޼ҵ忡���� vartest �޼ҵ忡 test3 Ŭ������ ��ü�� myTest�� �ѱ⵵�� �Ѵ�.(�� �������� 1�� �Ѿ)
	}
}

// vartest �޼ҵ��� �Է� �Ķ���ʹ� �� 1�� �ƴ�, test3 Ŭ������ ��ü ��ü�̴�.