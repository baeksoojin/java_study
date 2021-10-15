package baekjoon;

import java.util.Scanner;

public class problem_2108 {
	
	public int max(int[] cnt, int[] array) {
		
		int max=-1;
		int target=0;
		
		for(int i=0; i<cnt.length;i++) {
			if(max<cnt[i])
			{
				max= cnt[i];
				target = array[i];
			}
		}
		//max값에는 횟수가 들어가있음.
		
		int count=0;
		for(int i=0; i<cnt.length; i++) {
			if(max==cnt[i]) {
				count++;
				if(count==2) {
					return array[i]; 
				}
			}
		}
		return target;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		
		int sum=0;
		
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
			sum+=array[i];
		}
		if(sum>=0)
			System.out.println((int)((double)sum/(double)n+0.5));
		//round는 소수점자리가 부호와 상관없이 0.5이상이라면 +1을 시켜줌. => 음수일때 반올림이 제대로 되지 않음.
		else
			System.out.println((int)((double)sum/(double)n-0.5));
			
		
		problem_2108 pro = new problem_2108();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if (array[j]>array[j+1]) {
					int temp;
					temp=array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		if(n==1)
			System.out.println(array[0]);
		else
			System.out.println(array[n/2]);
		
		int[] cnt = new int[n];
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(array[i]==array[j]) {
					cnt[i]++;
				}
			}
		}
		
		System.out.println(pro.max(cnt,array));
		
		
		if(n==1)
			System.out.println(0);
		else System.out.println(array[n-1]-array[0]);
		
		sc.close();
	}

}
