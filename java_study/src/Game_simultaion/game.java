package Game_simultaion;


public class game {
	
	public Character battle(Character blue, Character red) {
		blue.initialize();
		red.initialize();
		int i=0;
		//Character bar_com = new Barlog();
		while(blue.isDie()==false && red.isDie()==false) {
			
			if(i%2==0) {
				blue.whoAmI(); 
				System.out.print(" attacks with damage "); blue.attck(red); System.out.print(". ");
				red.whoAmI(); System.out.println(" has "+ red.hitPoint+" hit point now.");
				if(red.needPortion()) {
					if(red instanceof Barlog) {
						if(red.portionNumber>=2) {
							red.recover();
							red.whoAmI(); System.out.println(" eat portion and "+red.hitPoint+" point now.");
						}
						
					}
					red.recover();
					red.whoAmI(); System.out.println(" eat portion and "+red.hitPoint+" point now.");
					
				}
				if(blue instanceof Barlog) {
					System.out.println("number1");
					blue.whoAmI();
					System.out.print(" attacks with damage "); blue.attck(red); System.out.print(". ");
					red.whoAmI(); System.out.println(" has "+ red.hitPoint+" hit point now.");
					if(red.needPortion()) {
						red.recover();
						red.whoAmI(); System.out.println(" eat portion and "+red.hitPoint+" point now.");
					}
				}
					
			}
			else {
				red.whoAmI(); System.out.print(" attacks with damage "); red.attck(blue); System.out.print(". ");
				blue.whoAmI(); System.out.println(" has "+blue.hitPoint+" hit point now.");
				if(blue.needPortion()) {
					if(blue instanceof Barlog) {
						if(blue.portionNumber>=2)
						{
							blue.recover();
							blue.whoAmI(); System.out.println(" eat portion and "+blue.hitPoint+" point now.");
						}
						blue.recover();
						blue.whoAmI(); System.out.println(" eat portion and "+blue.hitPoint+" point now.");
					}
				}
				if(red instanceof Barlog) {
					System.out.println("number1");
					red.whoAmI();
					System.out.print(" attacks with damage "); red.attck(blue); System.out.print(". ");
					blue.whoAmI(); System.out.println(" has "+blue.hitPoint+" hit point now.");
					if(blue.needPortion()) {
						blue.recover();
						blue.whoAmI(); System.out.println(" eat portion and "+blue.hitPoint+" point now.");
					}
				}
				
				
			}
			i++;
			
		}
		if(blue.isDie()) {
			blue.whoAmI();
			System.out.println(" is dead.");
			return red;
		}
		else {
			red.whoAmI();
			System.out.println(" is dead.");
			return blue;
		}
		
	}
	
	public void tournament(Character hu, Character cyber, Character bar, Character el) {
		
		System.out.println("------------------round1-----------------");
		Character a= this.battle(hu,cyber);
		System.out.println("------------------round2-----------------");
		Character b = this.battle(bar, el);
		System.out.println("------------------round3-----------------");
		Character result = this.battle(a, b);
		//우승자메세지를 출력한다.
		System.out.println("------------------result-----------------");
		System.out.print("Winner is ");
		result.whoAmI();
	}
	
	public static void main(String[] args) {
		
		Character hu = new Human();
		Character cyber = new CyberDaemon();
		Character bar = new Barlog();
		Character el = new Elf();
		
		game game_play = new game();
		game_play.tournament(hu, cyber, bar, el);
		if(bar instanceof Barlog) {
			System.out.println("발록그 오브젝트 형태를 가짐");
		}
		
		
	}

}
