package java_study;

public class study_1_soorim{

	public static void main(String[] args) {
		int A=111;
		System.out.print("111�� �������� ��ȯ: ");
		for(int i=7; i>0; i--) { //8�ڸ��� ������ ���
			int bin=A>>i&1;
			System.out.print(bin);
		}
	}
}