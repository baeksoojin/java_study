package java_study;

import java.util.Arrays;
import java.util.Scanner;

public class study_3 {

	public void solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2[0].length; j++)
                for (int n = 0; n < arr1[0].length; n++)
                    answer[i][j] += (arr1[i][n] * arr2[n][j]);

        System.out.println("result : "+Arrays.deepToString(answer));
        
	}
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a;
		a = new int[2][4];
		int[][] b;
		b = new int[4][3];
		
		System.out.println("ù��° [2][4]����� �Է��ϼ���");
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("�ι�° ��� [4][3]����� �Է��ϼ���");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		study_3 myTest = new study_3();
	    myTest.solution(a,b);
	    sc.close();
	}

}
