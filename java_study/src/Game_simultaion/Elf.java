package Game_simultaion;

public class Elf extends Character {

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		this.hitPoint=180;
		this.portionNumber=5;
	}

	@Override
	public void attck(Character c) {
		// TODO Auto-generated method stub
		if(Math.random()<=0.3)
			System.out.print(c.getDamage(70));
		else
			System.out.print(c.getDamage(35));
	}

	@Override
	public boolean needPortion() {
		// TODO Auto-generated method stub
		if((this.hitPoint<=120 && this.hitPoint>0) && this.portionNumber>0)
		{
			return true;
		}
		else return false;
	}

	@Override
	public void recover() {
		// TODO Auto-generated method stub
		this.portionNumber--;
		if(Math.random()<=0.25)
			this.hitPoint += 60;
		else
			this.hitPoint +=30;
	}

	@Override
	public void whoAmI() {
		// TODO Auto-generated method stub
		System.out.print("<Elf>");
	}

	@Override
	public int getDamage(int damage) {
		// TODO Auto-generated method stub

		this.hitPoint -= damage;
		return damage;
	}

}
