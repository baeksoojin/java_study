package error_study;

import java.io.FileOutputStream;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class TextFile2_soorim {
	    public static void main(String[] args) {
		try {
		    OutputStream os_first = new FileOutputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\first.txt");
		    OutputStream os_second = new FileOutputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\second.txt");
		    
		    String str1 = "10 11 23 13 21 31 24 52 12 7 ";
		    String str2 = "23 21 24 31 2 7 9 5 4 3 ";
		    byte[] by1=str1.getBytes();
		    byte[] by2=str2.getBytes();
		    os_first.write(by1);
		    os_second.write(by2);
		    
		    os_first.close();
		    os_second.close();	// first.txt, second.txt 생성
		    
		    byte[] b1=new byte[1024];	//first 파일 읽기
		    byte[] b2=new byte[1024];	//second 파일 읽기
		    String[] first_str;		//first 배열 저장
		    String[] second_str;	//second 배열 저장
		    
		    InputStream is_first=new FileInputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\first.txt");
		    InputStream is_second=new FileInputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\second.txt");
			
		    is_first.read(b1);
			String first_txt=new String(b1);
			first_str=first_txt.split(" ");
			
			System.out.print("first.txt: ");
			for(int i=0; i<first_str.length; i++) {
				System.out.print(first_str[i]+" ");
			}
		    is_first.close();
		    
		    
		    System.out.println();
		    is_second.read(b2);
			String second_txt=new String(b2);
			second_str=second_txt.split(" ");
			
			System.out.print("second.txt: ");
			for(int i=0; i<second_str.length; i++) {
				System.out.print(second_str[i]+" ");
			}
		    is_second.close();
			System.out.println();
		    
		    
		    String[] third_str = new String[first_str.length];		//공통되는 숫자를 저장할 배열
		    int a=0;
		    
            // 개선된 for문
		    for(String F:first_str) {
		    	for(String S:second_str) {
		    		if(F.equals(S)) {
		    			third_str[a]=F;
		    			a++;
		    		}
		    	}
		    }
		    
		    String result="";
		    for(int i=0; i<third_str.length; i++) {
		    	if(third_str[i]!=null) {
		    		result+=third_str[i]+" ";
		    	}
		    }
		    
		    byte[] b3=result.getBytes();
		    OutputStream os_third = new FileOutputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\third.txt");
		    os_third.write(b3);
		    os_third.close();
		    
		    InputStream is_third=new FileInputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\third.txt");
		    is_third.read(b3);
			String third_txt=new String(b3);
			third_str=third_txt.split(", ");
			System.out.print("third.txt: ");
			for(int i=0; i<third_str.length; i++) {
				if(third_str[i]!=null)
					System.out.print(third_str[i]+"\n");
			}
		    is_third.close();
		    		
		} catch (Exception e) {
	            e.getStackTrace();
		}
	}
}