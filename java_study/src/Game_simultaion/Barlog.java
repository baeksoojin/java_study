package Game_simultaion;

public class Barlog extends Character {

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		this.hitPoint=170;
		this.portionNumber=5;
		
	}

	@Override
	public void attck(Character c) {
		// TODO Auto-generated method stub
		int sum=0;
		if(Math.random()<=0.2) {
			sum+=35;
		}
		else sum+=25;
		if(Math.random()<=0.2) {
			System.out.print(c.getDamage(sum));
		}
		else System.out.print(c.getDamage(sum));
	}//2�� ����.

	@Override
	public boolean needPortion() {
		// TODO Auto-generated method stub
		if((this.hitPoint<=100 && this.hitPoint>0) && this.portionNumber>0)
		{
			return true;
		}
		else return false;
	}//Barlog���� ������ ���ݿ� ���� �������� �׼� ���� ���� 70�� ��찡 ����. 70�� ����������.

	@Override
	public void recover() {
		// TODO Auto-generated method stub
			this.portionNumber--;
			this.hitPoint+=30;
	
	}

	@Override
	public void whoAmI() {
		// TODO Auto-generated method stub
		System.out.print("<Barlog>");
		
	}

	@Override
	public int getDamage(int damage) {
		// TODO Auto-generated method stub

		this.hitPoint -= damage;
		return damage;
	}

}
