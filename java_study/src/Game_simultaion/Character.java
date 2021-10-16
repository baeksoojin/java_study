package Game_simultaion;

public abstract class Character {
	
	public int hitPoint;
	public int portionNumber;
	
	public abstract void initialize();
	//각각의 캐릭터마다 달라지기때문에 오버라이딩하기로하자
	
	public abstract void attck(Character c);
	//c에게 데미지를 주고 c객체에 this의 공격데미지 만큼 getDamage를 통해서 넘겨줌.
	public abstract boolean needPortion();
	//상대방의 공격에 의해서 받을수 있는 최대 데미지보다 내가 가진 hp가 작다면 물약이 남았으면 먹음.
	public abstract void recover();
	// needPortion에 의해서 결정된 물약여부에 따라서 portionnum을 줄이고 hp를 얻음.
	public abstract void whoAmI();
	
	public abstract int getDamage(int damage);
	
	public boolean isDie() {
		if(this.hitPoint<=0) {
			return true;
			//조건에 물약 조건을 첨가해야할수도
		}
		else {
			return false;
		}
	}
	

}
