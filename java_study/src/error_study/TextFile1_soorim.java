package error_study;

import java.io.FileOutputStream;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

// soorim

/*
1. 메모장 파일 생성 후 숫자들을 하나의 String으로 지정해 파일에 저장. (first.txt, second.txt)
2. 메모장 파일에서 값을 읽어와서 " " 단위로 나누고, 이를 문자열 배열에 저장. (first_str, second_str)
3. first_str과 second_str 값을 하나하나 비교하면서 같은 값이 나오면 third_str 배열에 저장.
4. third_str 배열에 저장된 값 중에서 null이 아닌 값들만 뽑아서 새로 생성한 문자열 result에 저장.
   -> String result = "23 21 31 24 7"; 꼴의 형태로 값이 저장됨.
5. result 문자열을 third.txt 메모장에 저장.
6. 최종적으로 third.txt 파일에 적혀 있는 문자를 읽어오기.
*/

public class TextFile1_soorim {
	    public static void main(String[] args) {
		try {
		    OutputStream os_first = new FileOutputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\first.txt");
		    OutputStream os_second = new FileOutputStream("C:\\Users\\smile\\Desktop\\3학년 2학기\\모바일소프트웨어\\File 입출력\\second.txt");
		    
		    String str1 = "10 11 23 13 21 31 24 52 12 7 ";  //  *중요!!*: " " 단위로 배열을 나눴기 때문에, 맨 마지막 숫자 뒤에도 " "을 넣어줘야 함.
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
			first_str=first_txt.split(" ");  // " " 단위로 숫자를 쪼개어 배열에 저장
			
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
		    
			for(int i=0; i<first_str.length; i++) { //first_str.length
		    	for(int j=0; j<second_str.length; j++)
		    	{
		    		if(first_str[i].equals(second_str[j])) {
		    			third_str[a]=first_str[i];
		    			a++;
		    		}
		    		else {
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

