package java_study;


import java.io.*;

public class FileIO_sujin {public static void main(String[] args)throws IOException{
	FileInputStream first = null;
	FileInputStream second = null;
	try {
			first = new FileInputStream("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\first.txt");
			second = new FileInputStream("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\second.txt");
			int size = first.available();
			System.out.print(size);
			int f_array[] = new int[size];
			int s_array[] = new int[size];
			
			for(int i=0; i<size; i++) {
				f_array[i] = first.read();
				s_array[i] = second.read();
			}
			for(int i=0; i<10; i++) {
				
				System.out.print(f_array[i]+" ");
				System.out.print(s_array[i]+" ");
			}
			
			
			OutputStream os = new FileOutputStream("C:\\Users\\�����\\OneDrive\\���� ȭ��\\3�г�2�б�\\����ϼ���Ʈ����\\result.txt");
			for(int j=0; j<size; j++) {
				
				for(int k=0; k<size; k++) {
					if(f_array[j] == s_array[k]) {
						os.write(f_array[j]);
						System.out.print(f_array[j]);
						
					}
				}
			}
			
			os.close();
	}catch(Exception e){
		e.getStackTrace();
		
	}
	
	
}
}

