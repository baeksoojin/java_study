package java_study;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIO_sujin {
	
	public static void main(String[] args) throws IOException{
		
			Scanner first = new Scanner(new File("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\first.txt"));
			Scanner second = new Scanner(new File("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\second.txt"));
			
			int f_array[] = new int[10];
			int s_array[] = new int[10];
			
			int i=0;
			while(first.hasNext()) {
				f_array[i] = first.nextInt();
				i+=1;
				
			}
			
			i=0;
			while(second.hasNext()) {
				s_array[i] = second.nextInt();
				i+=1;
			}
			
			for(int j=0; j<f_array.length; j++) {
				
				for(int k=0; k<s_array.length; k++) {
					if(f_array[j] == s_array[k]) {
						System.out.print(f_array[j]+" ");
					}
				}
			}
	}
}

