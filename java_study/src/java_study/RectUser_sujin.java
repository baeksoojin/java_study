package java_study;

import java.util.Scanner;

public class RectUser_sujin {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ʺ�� ���̸� ���� �������� ���ʴ�� �Է��ϼ��� : ");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		Rect_sujin rect = new Rect_sujin(w,h);
		rect.getArea();
		rect.getCircum();
		
		sc.close();
	}
	

}
