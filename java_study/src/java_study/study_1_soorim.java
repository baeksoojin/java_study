package java_study;

public class study_1_soorim{

	public static void main(String[] args) {
		int A=111;
		System.out.print("111을 이진수로 변환: ");
		for(int i=7; i>0; i--) { //8자리로 이진수 출력
			int bin=A>>i&1;
			System.out.print(bin);
		}
	}
}