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
	}//human�� ������ ������ ĳ������ ������ �ִ�ġ�� ���� �� �ִ� Ÿ���� 70�̱⿡. Human�� �ִ� HP���� 70�� ������ ������ ����.
	

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
