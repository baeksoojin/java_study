package java_study;

public class TV_soorim {
	
		public static int TV_on() { //TV를 켜다
			System.out.println("TV가 켜졌습니다.");
			return 1;
		}
		
		public static int TV_off() { //TV를 끄다
			System.out.println("TV가 종료됩니다.");
			return 0;
		}
		
		public static int channel_up(int channel) { //채널을 하나 올린다
			System.out.println("채널을 하나 올린다.");
			return channel+1;
		}
		
		public static int channel_down(int channel) { //채널을 하나 내린다
			System.out.println("채널을 하나 내린다");
			return channel-1;
		}
		
		public static int volume_up(int volume) { //볼륨을 높인다
			System.out.println("볼륨을 높인다");
			return volume+1;
		}
		
		public static int volume_down(int volume) { //볼륨을 낮춘다
			System.out.println("볼륨을 낮춘다");
			return volume-1;
		}
}
