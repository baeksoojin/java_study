public class homework1 {

	public static void main(String[] args) {
		int A=123;
		System.out.print("123�� �������� ��ȯ: ");
		for(int i=7; i>0; i--) { //8�ڸ��� ������ ���
			int bin=A>>i&1;
			System.out.print(bin);
		}
	}
}
