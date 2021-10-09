package java_study;

import java.io.*;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

// 숫자를 메모장 파일에 입력하고, 다시 불러오면 이상한 문자 기호(기계어로 추정)로 불러와지는데, 그 이유와 해결 방안을 아직 모르겠다.
// 오류 원인과 해결방안은 error_study에 올릴 예정

public class TextFile_error {
	
	public static void main(String[] args) {
		byte Number1[]= {10, 11, 23, 13, 21, 31, 24, 52, 12, 7};
		byte Number2[]= {23, 21, 24, 31, 2, 7, 9, 5, 4, 3};
		
		try {			
			OutputStream os1=new FileOutputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\first1.txt");
			for (int i=0; i<Number1.length; i++) {
				os1.write(Number1[i]);
				System.out.print(Number1[i]+" ");
			}
			
			System.out.print("\n");
			OutputStream os2=new FileOutputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\second2.txt");
			for (int i=0; i<Number1.length; i++) {
				os2.write(Number1[i]);
				System.out.print(Number2[i]+" ");
			}
			
			os1.close();
			os2.close();	// first.txt, second.txt 생성
			
			
			FileInputStream is1 = new FileInputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\first1.txt");
			int size1=is1.available();
			
			for(int i=0; i<size1; i++) {
				System.out.print((char)is1.read()+" ");
			}
						
			System.out.println();
			FileInputStream is2 = new FileInputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\first1.txt");
			int size2=is2.available();
			
			for(int i=0; i<size2; i++) {
				System.out.print((char)is2.read()+" ");
			}
			
			is1.close();
			is2.close();	//first.txt, second.txt 출력
			
			catch (IOException e) {
			System.out.print("Exception");
			}
	}
}
