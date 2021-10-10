package java_study;


import java.io.*;

public class FileIO_sujin {public static void main(String[] args)throws IOException{
	FileInputStream first = null;
	FileInputStream second = null;
	try {
			first = new FileInputStream("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\first.txt");
			second = new FileInputStream("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\second.txt");
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
			
			
			OutputStream os = new FileOutputStream("C:\\Users\\백수진\\OneDrive\\바탕 화면\\3학년2학기\\모바일소프트웨어\\result.txt");
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

