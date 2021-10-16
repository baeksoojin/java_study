package java_study;

public class Human extends Character{

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		this.hitPoint = 200;
		this.portionNumber = 5;
	}

	@Override
	public void attck(Character c) {
		// TODO Auto-generated method stub
		System.out.print(c.getDamage(50));
	}

	@Override
	public boolean needPortion() {
		// TODO Auto-generated method stub
		if((this.hitPoint<=130 && this.hitPoint>0) && this.portionNumber>0)
		{
			return true;
		}
		else return false;
	}//human을 제외한 나머지 캐릭터중 공격중 최대치로 입을 수 있는 타격이 70이기에. Human의 최대 HP에서 70이 들어오면 물약을 먹음.
	

	@Override
	public void recover() {
		// TODO Auto-generated method stub

		this.portionNumber--;
		this.hitPoint+=40;
		
	}

	@Override
	public void whoAmI() {
		// TODO Auto-generated method stub
		System.out.print("<Human>");
	}

	@Override
	public int getDamage(int damage) {
		// TODO Auto-generated method stub

		this.hitPoint -= damage;
		return damage;
	}
	
	
	

}
