package java_study;

public class Rect_sujin {


	int width;
	int height;
	
	Rect_sujin(int w, int h){
		this.width = w;
		this.height = h;
		
	}
	
	public void getArea() {
		
		int area = this.width*this.height;
		System.out.println("���� : "+area);
		
	}
	
	public void getCircum() {
		
		int cir = this.width + this.height;
		System.out.println("�ѷ� : "+2*cir);
	}

}
