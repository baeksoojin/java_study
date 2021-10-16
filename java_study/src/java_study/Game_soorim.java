package java_study;

public class Game_soorim {
	
	static Character battle(Character blue, Character red) {

		blue.initialize();	//물약, 체력 초기화
		red.initialize();
		
		Character winner;
		while(blue.isDie()==false && red.isDie()==false) { 
			blue.whoAmI();
			System.out.print(" attacks with damage ");
			blue.attack(red);
			System.out.print(". ");
			red.whoAmI();
			System.out.println(" has "+red.hitPoint+" now.");
			
			if(red.needPortion()==true) {
				red.recover();
				red.whoAmI();
				System.out.println(" eats portion and "+red.hitPoint+" point now.");
			}
	
			if(red.isDie()==true) {
				break;
			}
			
			red.whoAmI();
			System.out.print(" attacks with damage ");
			red.attack(blue);
			System.out.print(". ");
		
			blue.whoAmI();
			System.out.println(" has "+blue.hitPoint+" now.");
			if(blue.needPortion()==true) {
				blue.recover();
				blue.whoAmI();
				System.out.println(" eats portion and "+blue.hitPoint+" point now.");
			}
			
			if(blue.isDie()==true) {
				break;
			}
		}
		
		if(red.isDie()==true) {
			winner=blue;
		}
		else {
			winner=red;
		}
		
		return winner;
	}
	
	static void tournament(Character hu, Character cyber, Character bar, Character el) {
		//토너먼트로 경기를 시키며, 승자의 whoAmI 메소드를 통해 승자 메시지를 출력
		System.out.println("================ 준결승전 1 ================");
		Character w1=battle(hu, bar);
		System.out.print("=> 준결승전 1의 승자는 ");
		w1.whoAmI();
		System.out.println("입니다.\n");
		System.out.println("================ 준결승전 2 ================");
		Character w2=battle(el, cyber);
		System.out.print("=> 준결승전 2 승자는 ");
		w2.whoAmI();
		System.out.println("입니다.\n");
		System.out.println("================ 결승전 ================");
		Character final_winner=battle(w1,w2);
		System.out.print("=> 최종 우승자는 ");
		final_winner.whoAmI();
		System.out.println("입니다.\n");
	}
	
	public static void main(String[] args) {
		Human h=new Human();
		Cyber_Daemon cd=new Cyber_Daemon();
		Barlog b=new Barlog();
		Elf e=new Elf();
		
		tournament(h, cd, b, e);
	}

}