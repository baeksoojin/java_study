package java_study;

public class study_1 {
	public static void main(String[] args) {
		
		int num = 123;
		
		for (int i = 7; i >= 0; --i) { //8자리 숫자까지 나타냄
	        int result = num >> i & 1;
	        System.out.printf("%d",result);
	    }
	}

}
