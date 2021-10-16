package java_study;
import java.util.Random;

public class Barlog_soorim extends Character_soorim{
	
		@Override
		void initialize() {
			this.hitPoint=170;
			this.portionNumber=5;
		}
		
		@Override
		void attack(Character c) {	//Barlog는 한 번에 두 번 공격한다.
			int total_d=0;
			Random r1=new Random();
			if(r1.nextInt(100)<20) {	//20% 확률로 35 공격
				total_d+=c.getDamage(35);
			}
			else {
				total_d+=c.getDamage(25);
			}
			
			Random r2=new Random();
			if(r2.nextInt(100)<20) {
				total_d+=c.getDamage(35);
			}
			else {
				total_d+=c.getDamage(25);
			}
			System.out.print(total_d);
		}
		
		@Override
		int getDamage(int damage) {
			this.hitPoint-=damage;
			return damage;
		}
		
		@Override
		void recover() {
			if(this.portionNumber>1) {
				this.hitPoint+=30*2;
			}
			else {
				this.hitPoint+=30;
			}
		}
		
		@Override
		boolean needPortion() { 
			if(this.portionNumber>0 && this.hitPoint<=100 && this.hitPoint>0) {
				this.portionNumber--;
				return true;
			}
			else {
				return false;
			}
		}
		
		@Override
		void whoAmI() {
			System.out.print("Barlog");
		}


}
