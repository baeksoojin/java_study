// Self number 찾기

public class self_number_4673_soorim {
	static int arr[]=new int[20000];	//n을 저장할 배열(생성자가 있는 숫자들)
	public static void dsum(int x) {
		int sum=x;
		while(sum<10000) {
			int a=sum%10;				//일의 자리 숫자
			int b=(sum%100)/10;			//십의 자리 숫자
			int c=(sum%1000)/100;		//백의 자리 숫자
			int d=(sum%10000)/1000;		//천의 자리 숫자
			int e=(sum%100000)/10000;	//만의 자리 숫자

			sum=sum+a+b+c+d+e;	//sum 갱신
			arr[sum]=sum;
		}
	}
	
	public static void main(String[] args) {
		for(int i=1; i<10000; i++) {
			dsum(i);
		}

		for(int i=1; i<=10000; i++) {
			if(arr[i]==0) {
				System.out.println(i);
			}
		}
	}
}

