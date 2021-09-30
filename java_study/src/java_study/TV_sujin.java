package java_study;

public class TV_sujin {
	int channel;
	int volume;
	
	String on_off;
	
	TV_sujin(int c,int v) {
		
		this.channel = c;
		this.volume = v;
	}
	
	public void tv_on(String on) {
		
		this.on_off = on;
	}
	public void tv_off(String off) {
		this.on_off = off;
	}
	
	public void ch_up() {
		this.channel +=1;
	}
	
	public void ch_down() {
		this.channel -=1;
	}
	
	public void vo_up(){
		this.volume +=1;
	}
	
	public void vo_down() {
		this.volume -=1;	
		}
	
	public void print_tv() {
		
		System.out.println("Ã¤³Î : "+this.channel+" º¼·ý : "+this.volume);
	}

}
