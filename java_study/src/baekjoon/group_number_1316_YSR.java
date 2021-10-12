java.util.Scanner; //스캐너 사용
import java.util.Scanner;	//스캐너 사용을 위한 import문

//아직 하는중(틀림)

public class group_number_1316_YSR {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();	//스캐너 사용 방법 외우기
		String word;	//입력받을 단어
		int num=N;	//그룹 단어의 개수 세기
		
		for(int i=0; i<N; i++) {
			word=scan.next();
			System.out.println("입력받은 단어:"+word);
			
			String[] alphabet;
			alphabet=word.split("");	//입력받은 단어를 각 자리별로 쪼개서 배열에 저장
			
			for(int a=0; a<alphabet.length; a++) {
				System.out.print(alphabet[a]);
			}
			
			System.out.println();
			for (int j=0; j<alphabet.length-1; j++) {	//j=alphabet 배열의 length가 되면, 그 다음 자리의 알파벳과 비교해야하는데 해당 값이 없으므로 오류가 뜬다.
				if(alphabet[j]!=alphabet[j+1]) {
					int Num=num;	//Num: 원래의 num 숫자
					for(int k=j+2; k<alphabet.length; k++) {
						if(alphabet[j].equals(alphabet[k])) {	//그룹 단어X
							System.out.println(alphabet[j]+"=="+alphabet[k]);
							num-=1;
							System.out.println("num="+num);
							break;
						}
						else
						{
							System.out.println(alphabet[j]+"!="+alphabet[k]);
						}
					}
					if(num==Num-1) {	//그룹단어 count 했으면, for문 빠져 나가기(중복 count 막기 위함)
						break;
					}
				}
			}
		}
		System.out.print(num);
		scan.close();
	}

}