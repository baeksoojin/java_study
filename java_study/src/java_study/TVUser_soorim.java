package java_study;
import java.util.Scanner;

public class TVUser_soorim {

	public class TVUser {

		public static void main(String[] args) {
			System.out.print("ä��(channel)�� ����(volume)�� �ʱⰪ�� �Է��ϼ���: ");
			Scanner scan=new Scanner(System.in);
			int channel=scan.nextInt();
			int volume=scan.nextInt();
			
			System.out.println("\n0. TV�� �Ѵ�.");
			System.out.println("1. TV�� ����.");
			System.out.println("2. ä���� �ϳ� �ø���.");
			System.out.println("3. ä���� �ϳ� ������.");
			System.out.println("4. ������ ���δ�.");
			System.out.println("5. ������ �����.");
			System.out.println("0~5 ������ ��ȣ�� �Է��� ä�� �Ǵ� ������ �������ּ���. (��, ä���̳� ���� ������ ���� ��, TV�� �Ѿ��մϴ�.)");
			
			while(true) {
				System.out.print("\n���� �Է�: ");
				int first_number=scan.nextInt();
				if (first_number==0) {
					TV_soorim.TV_on();
					break;
				}
				else {
					System.out.println("TV�� ���� ���ּ���.");
				}
			}
			
			while(true) {
				System.out.print("\n���� �Է�: ");
				int number=scan.nextInt();
				
				if (number==0) {	//TV�� �Ѵ�.
					System.out.println("�̹� TV�� ���ֽ��ϴ�. �ٸ� ���ڸ� �Է��ϼ���.");
				}
				
				else if (number==1) {	//TV�� ����.
					TV_soorim.TV_off();
					break;
				}
				
				else if (number==2) {	//ä���� �ϳ� �ø���
					channel=TV_soorim.channel_up(channel);
				}
				
				else if (number==3) {	//ä���� �ϳ� ������
					channel=TV_soorim.channel_down(channel);
				}
				
				else if (number==4) {	//������ ���δ�
					volume=TV_soorim.volume_up(volume);
				}
				
				else if (number==5) {	//������ �����
					volume=TV_soorim.volume_down(volume);
				}
				else {
					System.out.println("���� ���� ���Դϴ�.");
				}
				System.out.println("���� ä�� �ѹ�: " + channel + ", ������: " + volume);
			}
			scan.close();
			System.out.println("���� ä�� �ѹ�: " + channel + ", ������: " + volume);
		}	
	}

}
