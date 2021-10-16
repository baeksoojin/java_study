package java_study;

public class Human_soorim extends Character_soorim {

    @Override
    void initialize() {
        this.hitPoint=200;
        this.portionNumber=5;
    }
    
    @Override
    void attack(Character c){
        int d=c.getDamage(50);
        System.out.print(d);
    }
    
    @Override
    int getDamage(int damage) {
        this.hitPoint-=damage;
        return damage;
    }
    
    @Override
    void recover() {
        this.hitPoint+=40;
    }
    
    @Override
    boolean needPortion() {
        if(this.portionNumber>0 && this.hitPoint<=130 && this.hitPoint>0) {
            this.portionNumber--;
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    void whoAmI() {
        System.out.print("Human");
    }

}
