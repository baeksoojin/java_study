package java_study;

import java.util.Scanner;

public class RectUser_soorim {
public static void main(String[] args) {
		
		System.out.print("�ʺ�� ���̸� �Է��ϼ���: ");
		Scanner scan=new Scanner(System.in);
		double width=scan.nextDouble();
		double height =scan.nextDouble();
		scan.close();
		
		double Area = Rect_soorim.getArea(width, height);
		double Circum = Rect_soorim.getCircum(width, height);
		
		System.out.println("�簢���� ����: "+Area);
		System.out.println("�簢���� �ѷ�: "+Circum);
	}
}
