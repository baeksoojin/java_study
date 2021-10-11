package error_study;

public class String_method {
	
	public static void main(String[] args) {
		String st = "공백을 기준으로 분할하는 연습을 해봅시다.";
		
		String[] st_array = st.split(" ");
		
		for(int i=0; i<st_array.length; i++) {
			System.out.print(st_array[i]);
		}
		
		
	}

}
