package java_study;

public class Staff_static_Ex {
	
	private static double sal;
	//�޿� ������ private ���� ������ �����Ѵ�
	
	public static final String DEPARTMENT = "������";
	//final�� ����Ϸ����� �� ��� �빮�ڷ� �ڰ��ؾ���.
	
	public static void main(String args[]) {
		sal = 1000;
		System.out.println(DEPARTMENT + "��ձ޿� : "+sal);
	}
	
	
}
