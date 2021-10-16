package java_study;

public abstract class Character_soorim {
	
	int hitPoint; //체력
	int portionNumber; // 가지고 있는 물약의 수
	
	abstract void initialize();				//물약, 체력 초기화
	abstract void attack(Character c);		//다른 캐릭터를 공격함
	abstract int getDamage(int damage);		//데미지를 입힘
	abstract void recover();				//회복
	abstract boolean needPortion();			//물약(포션) 먹기
	abstract void whoAmI();					//어떤 클래스에 속해있는지
	
	boolean isDie() {						//캐릭터가 죽었는지 살았는지 판별
		if(this.hitPoint<=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
