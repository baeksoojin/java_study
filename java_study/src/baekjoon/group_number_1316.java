package baekjoon;

import java.util.Scanner;

public class group_number_1316 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		
		String[] st = new String[n];
		
		for(int i=0; i<n; i++) {
			
			st[i] = sc.next();//next의 default값은 string => int나 double로 change가능
		}
		
		for(int i=0; i<n; i++) {
			if(st[i].length()==1) {
				cnt++;
				continue;
			}
			int [] check = new int[26];
			check[(int)st[i].charAt(0)-97]=1;
			for(int j=1; j<st[i].length(); j++) {
				int c = st[i].charAt(j);
				
				if(check[c-97]!=0 && st[i].charAt(j-1)!=st[i].charAt(j)) {
					break;
				}
				else {
					check[c-97]+=1;
					if(j==st[i].length()-1) {
						cnt++;
					}
				}
				
			}
		}
		
		System.out.print(cnt);
		sc.close();
	}

}
