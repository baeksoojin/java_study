package java_study;

public class study_1 {
	public static void main(String[] args) {
		
		int num = 123;
		
		for (int i = 7; i >= 0; --i) { //8�ڸ� ���ڱ��� ��Ÿ��
	        int result = num >> i & 1;
	        System.out.printf("%d",result);
	    }
	}

}
