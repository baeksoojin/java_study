package error_study;

import java.io.*;
import java.util.Scanner;

public class fileio1 {
	
	public static void main(String[] args) throws IOException{
		
		Scanner first = new Scanner(new File("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\first.txt"));
		Scanner second = new Scanner(new File("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\second.txt"));
		//File�� int���·� �о������ Scanner�� ����ϸ� ������.
		
		int f_array[] = new int[10];
		int s_array[] = new int[10];
		
		int i=0;
		while(first.hasNext()) {
			int a = first.nextInt();
			f_array[i] = a;
			i+=1;
			
		}
		FileOutputStream os = new FileOutputStream("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����//result.txt");
		
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
					//os.write(f_array[j]+" ");�� ����Ѵٸ� �̻��� ���ڰ� ���Ͽ� �����.
					//FileOutputStream�� ���ڿ��� ������� �ϸ� byte������ �ٲ������. getBytes()�� Ȱ��.
				}
			}
		}
		
		os.write(data.getBytes());
		os.close();
		
		
}
}

