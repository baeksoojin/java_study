package java_study;

import java.io.*;
import java.util.Scanner;

public class fileio1 {
	
	public static void main(String[] args) throws IOException{
		
		Scanner first = new Scanner(new File("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\first.txt"));
		Scanner second = new Scanner(new File("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\second.txt"));
		
		int f_array[] = new int[10];
		int s_array[] = new int[10];
		
		int i=0;
		while(first.hasNext()) {
			int a = first.nextInt();
			f_array[i] = a;
			i+=1;
			
		}
		PrintWriter os = new PrintWriter("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����//result.txt");
		
		i=0;
		while(second.hasNext()) {
			s_array[i] = second.nextInt();
			i+=1;
		}
		
		
		for(int j=0; j<f_array.length; j++) {
			
			for(int k=0; k<s_array.length; k++) {
				if(f_array[j] == s_array[k]) {
					os.print(f_array[j]+" ");
					System.out.print(f_array[j]+" ");
					
				}
			}
		}
		
		os.close();
		
		
}
}

