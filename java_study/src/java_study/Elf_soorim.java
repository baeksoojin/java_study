package java_study;
import java.util.Random;

public class Elf_soorim extends Character_soorim{
		@Override
		void initialize() { 
			this.hitPoint=180;
			this.portionNumber=5;
		}
			
		@Override
		void attack(Character c){
			Random r=new Random();
			if(r.nextInt(100)<30) {	//30% 확률로 70 공격함
				int d1=c.getDamage(70);
				System.out.print(d1);;
			}
			else {
				int d2=c.getDamage(35);
				System.out.print(d2);
			}
		}
			
		@Override
		int getDamage(int damage) {
			this.hitPoint-=damage;
			return damage;
		}
				
		@Override
		void recover() { 
			Random r=new Random();
			if(r.nextInt(100)<25) {	//25% 확률로 60 회복
				this.hitPoint+=60;
			}
			else {
				this.hitPoint+=30;
			}
		}
		
		@Override
		boolean needPortion() { 
			if(this.portionNumber>0 && this.hitPoint<=120 && this.hitPoint>0) {
				this.portionNumber--;
				return true;
			}
			else {
				return false;
			}
		}
		
		@Override
		void whoAmI() {
			System.out.print("Elf");
		}


}
