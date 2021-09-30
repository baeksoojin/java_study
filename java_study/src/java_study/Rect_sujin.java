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
		System.out.println("면적 : "+area);
		
	}
	
	public void getCircum() {
		
		int cir = this.width + this.height;
		System.out.println("둘레 : "+2*cir);
	}

}
