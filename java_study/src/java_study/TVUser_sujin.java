package java_study;

import java.util.Scanner;


public class TVUser_sujin {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ä�ΰ� ������ �ʱⰪ�� ���ʴ�� �Է��ϼ��� : ");
		
		int c = sc.nextInt();
		int v = sc.nextInt();
		
		TV_sujin tv = new TV_sujin(c,v);
		
		System.out.println("Ƽ�� Ű���� '0'�� �Է��ϼ���");
		int on_off_kind = sc.nextInt();
		if (on_off_kind == 0) {
			tv.tv_on("on");
		}
		
		System.out.println("ä�� �ø��� : 1 �Է� / ä�� ������ :2 �Է�/ ä�� ���� �ʿ� ���� : 3 �Է�");
		if (tv.on_off != "on") {
			System.out.println("TV�� �����ֽ��ϴ�. ������ TV�� Ű�� �����ϰڽ��ϴ�.");
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
		System.out.println("���� �ø��� : 1 �Է� / ���� ������ :2 �Է�/ ���� ���� �ʿ� ���� : 3 �Է�");
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
		
		System.out.println("Ƽ�� ���Ḧ ���Ѵٸ� 0�� �Է��ϼ���");
		on_off_kind = sc.nextInt();
		if (on_off_kind == '0') {
			tv.tv_off("off");
		}
		
		tv.print_tv();
		
		sc.close();
	}
}

