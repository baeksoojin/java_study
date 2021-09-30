package java_study;

import java.util.Scanner;


public class TVUser_sujin {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("채널과 볼륨의 초기값을 차례대로 입력하세요 : ");
		
		int c = sc.nextInt();
		int v = sc.nextInt();
		
		TV_sujin tv = new TV_sujin(c,v);
		
		System.out.println("티비를 키려면 '0'을 입력하세요");
		int on_off_kind = sc.nextInt();
		if (on_off_kind == 0) {
			tv.tv_on("on");
		}
		
		System.out.println("채널 올리기 : 1 입력 / 채널 내리기 :2 입력/ 채널 조절 필요 없음 : 3 입력");
		if (tv.on_off != "on") {
			System.out.println("TV가 꺼져있습니다. 강제로 TV를 키고 시작하겠습니다.");
			tv.tv_on("on");
			
		}
		else {
			int num=0;
			while(num!=3) {
				num = sc.nextInt();
				if(num==1) {
					tv.ch_up();
				}
				if(num==2) {
					tv.ch_down();
				}
			}
		}
		System.out.println("볼륨 올리기 : 1 입력 / 볼륨 내리기 :2 입력/ 볼륨 조절 필요 없음 : 3 입력");
		int num=0;
		while(num!=3) {
			num = sc.nextInt();
			if(num==1) {
				tv.vo_up();
			}
			if(num==2) {
				tv.vo_down();
			}
		}
		
		System.out.println("티비 종료를 원한다면 0을 입력하세요");
		on_off_kind = sc.nextInt();
		if (on_off_kind == '0') {
			tv.tv_off("off");
		}
		
		tv.print_tv();
		
		sc.close();
	}
}

