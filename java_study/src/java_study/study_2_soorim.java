package java_study;

import java.util.Scanner;

public class study_2_soorim {

	public static void main(String[] args) {
		System.out.print("두 숫자를 입력하세요: ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();

		int result=Power(a,b);
		System.out.println(a+"^"+b+"="+result);
		scan.close();

	}
	static int Power(int a, int b)
	{
		if(b==0)
		{
			return 1;
		}
		else
		{
			return a*Power(a, b-1);
		}
	}
}
