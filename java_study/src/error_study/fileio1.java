package error_study;

import java.io.*;
import java.util.Scanner;

public class fileio1 {
	
	public static void main(String[] args) throws IOException{
		
		Scanner first = new Scanner(new File("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\first.txt"));
		Scanner second = new Scanner(new File("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\second.txt"));
		//File을 int형태로 읽어오려면 Scanner를 사용하면 가능함.
		
		int f_array[] = new int[10];
		int s_array[] = new int[10];
		
		int i=0;
		while(first.hasNext()) {
			int a = first.nextInt();
			f_array[i] = a;
			i+=1;
			
		}
		FileOutputStream os = new FileOutputStream("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어//result.txt");
		
		i=0;
		while(second.hasNext()) {
			s_array[i] = second.nextInt();
			i+=1;
		}
		String data = "";
		i=0;
		for(int j=0; j<f_array.length; j++) {
			
			for(int k=0; k<s_array.length; k++) {
				if(f_array[j] == s_array[k]) {
					System.out.print(f_array[j]+" ");
					data +=f_array[j]+" ";
					//os.write(f_array[j]+" ");을 사용한다면 이상한 문자가 파일에 저장됨.
					//FileOutputStream은 문자열로 입출력을 하며 byte단위로 바꿔줘야함. getBytes()를 활용.
				}
			}
		}
		
		os.write(data.getBytes());
		os.close();
		
		
}
}

