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
		//round�� �Ҽ����ڸ��� ��ȣ�� ������� 0.5�̻��̶�� +1�� ������. => �����϶� �ݿø��� ����� ���� ����.
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
//		���������� �̿��� ������ �迭�� ũ�⸸ŭ �񱳸� ��� �����ϱ⿡ �ð����⵵�� o(n^2)�� �ʹ� ����.
		
		//Arryas.sort()�� ��� ��ü Ÿ���� ��� �־��� ��� nlogn. => n2���ٴ� �׻� ����.=> �������ĺ��� ����
		
		
		System.out.println(array[n/2]);
		
		//�ð��ʰ� ������ �ذ��ϱ� ���ؼ� �ֺ��� ó���ϱ� ���� size 8001�� �迭�� �������.
		
		int[] full_array = new int[8001];
		for(int t : array) {
			full_array[t+4000]++;
		}
		//array�� ���� t�� �ϳ��� ���ʴ�� �޾ƿö� for(int t:array)�� ��밡��.
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
					//������ �Ǿ��ֱ⶧���� ������ �ڵ�.
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

//���ؿ� �����ϴϱ� �ð��ʰ� �߻�. => �ֱ׷��� �˾ƺ����ҵ�.
//�ð��ʰ��� �ذ��ϱ� ���� 8001�� �������� �迭�� ����� for���� ���� Ƚ���� ���̰�, ���ĵ� Arrays.sort(�迭)�� Ȱ����.
//�ð��ʰ� �ذᰡ��.