package java_study;

import java.util.Scanner;

public class RectUser_soorim {
public static void main(String[] args) {
		
		System.out.print("너비와 높이를 입력하세요: ");
		Scanner scan=new Scanner(System.in);
		double width=scan.nextDouble();
		double height =scan.nextDouble();
		scan.close();
		
		double Area = Rect_soorim.getArea(width, height);
		double Circum = Rect_soorim.getCircum(width, height);
		
		System.out.println("사각형의 면적: "+Area);
		System.out.println("사각형의 둘레: "+Circum);
	}
}
