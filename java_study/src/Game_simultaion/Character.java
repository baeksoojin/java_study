package Game_simultaion;

public abstract class Character {
	
	public int hitPoint;
	public int portionNumber;
	
	public abstract void initialize();
	//������ ĳ���͸��� �޶����⶧���� �������̵��ϱ������
	
	public abstract void attck(Character c);
	//c���� �������� �ְ� c��ü�� this�� ���ݵ����� ��ŭ getDamage�� ���ؼ� �Ѱ���.
	public abstract boolean needPortion();
	//������ ���ݿ� ���ؼ� ������ �ִ� �ִ� ���������� ���� ���� hp�� �۴ٸ� ������ �������� ����.
	public abstract void recover();
	// needPortion�� ���ؼ� ������ ���࿩�ο� ���� portionnum�� ���̰� hp�� ����.
	public abstract void whoAmI();
	
	public abstract int getDamage(int damage);
	
	public boolean isDie() {
		if(this.hitPoint<=0) {
			return true;
			//���ǿ� ���� ������ ÷���ؾ��Ҽ���
		}
		else {
			return false;
		}
	}
	

}
