package baekjoon;

import java.util.Scanner;

public class problem_7568 {
	
	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int[] cnt = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(array[i][0] > array[j][0] && array[i][1]>array[j][1]) {
					cnt[i] ++;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print((cnt[i]+1)+" ");
		}
		sc.close();
	}

}
