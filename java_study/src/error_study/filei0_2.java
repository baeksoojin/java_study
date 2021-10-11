package error_study;

import java.io.*;
import java.util.*;

public class filei0_2 {
public static void main(String[] args) throws IOException{
		
		Scanner first = new Scanner(new FileInputStream("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\first.txt"));
		Scanner second = new Scanner(new FileInputStream("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\second.txt"));
		//FileInputStream을 Scanner로 받아와서 자유롭게 형식을 바꿔서 사용함. => 더 쉽게 동작가능.
		int first_array[] = new int[10];
		int second_array[] = new int[10];
		
		int i=0;
		while(first.hasNext()) {
			first_array[i] = first.nextInt();
			i++;
		}
		i=0;
		while(second.hasNext()) {
			second_array[i] = second.nextInt();
			i++;
		}
		
		FileOutputStream os = new FileOutputStream("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어//result.txt");
		
		String data = "";
		for(int j=0; j<first_array.length; j++) {
			for(int k=0; k<second_array.length; k++) {
				if(first_array[j]==second_array[k]) {
					System.out.print(first_array[j]+" ");
					data +=first_array[j]+" ";
				}
			}
		}
		
		os.write(data.getBytes());
		os.close();
		
		
}

}
