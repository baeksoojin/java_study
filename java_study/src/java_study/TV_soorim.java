package java_study;

public class TV_soorim {
	
		public static int TV_on() { //TV�� �Ѵ�
			System.out.println("TV�� �������ϴ�.");
			return 1;
		}
		
		public static int TV_off() { //TV�� ����
			System.out.println("TV�� ����˴ϴ�.");
			return 0;
		}
		
		public static int channel_up(int channel) { //ä���� �ϳ� �ø���
			System.out.println("ä���� �ϳ� �ø���.");
			return channel+1;
		}
		
		public static int channel_down(int channel) { //ä���� �ϳ� ������
			System.out.println("ä���� �ϳ� ������");
			return channel-1;
		}
		
		public static int volume_up(int volume) { //������ ���δ�
			System.out.println("������ ���δ�");
			return volume+1;
		}
		
		public static int volume_down(int volume) { //������ �����
			System.out.println("������ �����");
			return volume-1;
		}
}
