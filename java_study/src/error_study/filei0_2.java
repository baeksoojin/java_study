package error_study;

import java.io.*;
import java.util.*;

public class filei0_2 {
public static void main(String[] args) throws IOException{
		
		Scanner first = new Scanner(new FileInputStream("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\first.txt"));
		Scanner second = new Scanner(new FileInputStream("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\second.txt"));
		//FileInputStream�� Scanner�� �޾ƿͼ� �����Ӱ� ������ �ٲ㼭 �����. => �� ���� ���۰���.
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
		
		FileOutputStream os = new FileOutputStream("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����//result.txt");
		
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
