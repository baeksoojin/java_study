package baekjoon;

import java.util.Scanner;

public class problem_2108 {
	
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
			
		
		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n-i-1; j++) {
//				if (array[j]>array[j+1]) {
//					int temp;
//					temp=array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
//		버블정렬을 이용한 정렬은 배열의 크기만큼 비교를 계속 진행하기에 시간복잡도가 o(n^2)로 너무 느림.
		
		//Arryas.sort()의 경우 객체 타입일 경우 최악의 경우 nlogn. => n2보다는 항상 좋음.=> 버블정렬보다 좋음
		
		
		System.out.println(array[n/2]);
		
		//시간초과 문제를 해결하기 위해서 최빈값을 처리하기 위한 size 8001인 배열을 만들어줌.
		
		int[] full_array = new int[8001];
		for(int t : array) {
			full_array[t+4000]++;
		}
		//array의 값을 t로 하나씩 차례대로 받아올때 for(int t:array)로 사용가능.
		int max = 0;
		int max_index = 0;
		
		int second = 0;
		
		for(int i=0; i<8001; i++) {
			if(max<full_array[i]) max = full_array[i];
		}
		for(int i=0; i<8001; i++) {
			if(full_array[i] == max) {

				max_index = i-4000;
				if(second==1) {
					break;
					//정렬이 되어있기때문에 가능한 코드.
				}
				second=1;
			}
		}
		
		System.out.println(n==1?(int)array[0]:max_index);
		
		
		
		if(n==1)
			System.out.println(0);
		else System.out.println(array[n-1]-array[0]);
		
		sc.close();
	}

}

//백준에 제출하니까 시간초과 발생. => 왜그런지 알아봐야할듯.
//시간초과를 해결하기 위해 8001개 사이즈의 배열을 만들어 for문을 도는 횟수를 줄이고, 정렬도 Arrays.sort(배열)을 활용함.
//시간초과 해결가능.