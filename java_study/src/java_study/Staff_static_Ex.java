package java_study;

public class Staff_static_Ex {
	
	private static double sal;
	//급여 변수는 private 정적 변수로 설정한다
	
	public static final String DEPARTMENT = "영업부";
	//final을 사용하려고할 떄 모두 대문자로 자겅해야함.
	
	public static void main(String args[]) {
		sal = 1000;
		System.out.println(DEPARTMENT + "평균급여 : "+sal);
	}
	
	
}
