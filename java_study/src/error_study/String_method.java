package error_study;

public class String_method {
	
	public static void main(String[] args) {
		String st = "������ �������� �����ϴ� ������ �غ��ô�.";
		
		String[] st_array = st.split(" ");
		
		for(int i=0; i<st_array.length; i++) {
			System.out.print(st_array[i]);
		}
		//length�� Ȱ���Ҷ� �迭�� ���̸� �����Ϸ��� ()�� �����ؾ���. ���ڿ��� ���̸� ������ �� length()�� ����.
		
		
	}

}
