package java_study;
import java.util.Scanner;

public class TVUser_soorim {

	public class TVUser {

		public static void main(String[] args) {
			System.out.print("채널(channel)과 음량(volume)의 초기값을 입력하세요: ");
			Scanner scan=new Scanner(System.in);
			int channel=scan.nextInt();
			int volume=scan.nextInt();
			
			System.out.println("\n0. TV를 켜다.");
			System.out.println("1. TV를 끄다.");
			System.out.println("2. 채널을 하나 올린다.");
			System.out.println("3. 채널을 하나 내린다.");
			System.out.println("4. 볼륨을 높인다.");
			System.out.println("5. 볼륨을 낮춘다.");
			System.out.println("0~5 사이의 번호를 입력해 채널 또는 볼륨을 조절해주세요. (단, 채널이나 볼륨 조절을 원할 시, TV를 켜야합니다.)");
			
			while(true) {
				System.out.print("\n숫자 입력: ");
				int first_number=scan.nextInt();
				if (first_number==0) {
					TV_soorim.TV_on();
					break;
				}
				else {
					System.out.println("TV를 먼저 켜주세요.");
				}
			}
			
			while(true) {
				System.out.print("\n숫자 입력: ");
				int number=scan.nextInt();
				
				if (number==0) {	//TV를 켜다.
					System.out.println("이미 TV가 켜있습니다. 다른 숫자를 입력하세요.");
				}
				
				else if (number==1) {	//TV를 끄다.
					TV_soorim.TV_off();
					break;
				}
				
				else if (number==2) {	//채널을 하나 올린다
					channel=TV_soorim.channel_up(channel);
				}
				
				else if (number==3) {	//채널을 하나 내린다
					channel=TV_soorim.channel_down(channel);
				}
				
				else if (number==4) {	//볼륨을 높인다
					volume=TV_soorim.volume_up(volume);
				}
				
				else if (number==5) {	//볼륨을 낮춘다
					volume=TV_soorim.volume_down(volume);
				}
				else {
					System.out.println("옳지 않은 값입니다.");
				}
				System.out.println("현재 채널 넘버: " + channel + ", 볼륨량: " + volume);
			}
			scan.close();
			System.out.println("최종 채널 넘버: " + channel + ", 볼륨량: " + volume);
		}	
	}

}
