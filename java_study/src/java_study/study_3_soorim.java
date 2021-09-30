package java_study;

import java.util.Scanner;

public class study_3_soorim{
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int A[][]=new int[2][4];
		int B[][]=new int[4][3];
		
		System.out.print("A 행렬를 입력하세요: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				A[i][j]=scan.nextInt();
			}
		}
		
		System.out.print("B 행렬를 입력하세요: ");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				B[i][j]=scan.nextInt();
			}
		}
		scan.close();
		
		int [][] result=new int[A.length][B[0].length]; //result[2][3]
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				for(int k=0; k<A[0].length; k++) {
					result[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		
		System.out.println("A X B =");
		for(int i=0; i<A.length; i++) //계산 결과 행렬 출력
		{
			for(int j=0; j<B[0].length; j++) 
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
