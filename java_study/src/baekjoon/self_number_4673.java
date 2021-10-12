package baekjoon;

public class self_number_4673 {
	public static void main(String[] args) {
		
		int sum=0, size=0;
		int[] array = new int[100000];
		
		for(int i=1; i<10000; i++) {
			sum = i;
			
			if(i>0 && i<=9) {
				size = 1;
				array[sum+sum]=1;
				continue;
			}
			else if(i>=10 && i<=99) {
				size=2;
			}
			else if(i>=100 && i<=999) {
				size=3;
			}
			else {
				size=4;
			}
			
			int r=i;
			
			while(size!=1) {
				
				sum += r/ (int)Math.pow(10,size-1);
				size--;
				if(size==1) {
					sum+=r%(10*(size));
					break;
				}
				r = r % (int)Math.pow(10,size);
			}
			
			array[sum]=1;
			
		}
		
		for(int i=1; i<10000; i++) {
			if(array[i]!=1) {
				System.out.println(i);
			}
		}
		
		
	}
}
