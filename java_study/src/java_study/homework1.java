public class homework1 {

	public static void main(String[] args) {
		int A=123;
		System.out.print("123을 이진수로 변환: ");
		for(int i=7; i>0; i--) { //8자리로 이진수 출력
			int bin=A>>i&1;
			System.out.print(bin);
		}
	}
}
