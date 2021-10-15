java.util.Scanner; //스캐너 사용
import java.util.Scanner;	//스캐너 사용을 위한 import문

//아직 하는 중(틀림)
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		String word;
		int num=N;
		
		for(int i=0; i<N; i++) {
			word=scan.next();
			String[] alphabet=new String[100];
			alphabet=word.split("");

			
			for (int j=0; j<alphabet.length-1; j++) {
				//System.out.println("--2");
				if(alphabet[j].equals(alphabet[j+1])) {
					//System.out.println("--1");
					int Num=num;
					int a=j+1;
					while(alphabet[j].equals(alphabet[a]))
					{
							//연속되는 중복 값 바로 다음 처음으로 나오는 다른 값의 배열 번호 = a
							System.out.println(alphabet[j]+"="+alphabet[a]);
							a++;
							if(a==alphabet.length) {
								break;
							}
					}
					for(int k=a+1; k<alphabet.length; k++) {
						if(alphabet[j].equals(alphabet[k])) { //haapa, haaapa, haaap
							System.out.println(alphabet[j]+"="+alphabet[k]);
							num--;
							break;
						}
					}
					if(num==Num-1) {
						break;
					}
				}
				else {
					for(int l=0; l<alphabet.length-2; l++) // 2.hapa, hapaa
					{
						int Num=num;
						if(alphabet[l].equals(alphabet[l+2])) {
							System.out.println(alphabet[l]+"="+alphabet[l+2]);
							num--;
							break;
						}
					}
				}
			}
		}
		System.out.print(num);
		scan.close();
	}
}

//중복되는 횟수 잘 빼기 -> break 해서