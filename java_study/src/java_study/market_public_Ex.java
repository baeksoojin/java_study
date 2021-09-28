package java_study;

public class market_public_Ex {
	private String category;
	//category는 private여서 다른 class에서 활용할수가 없음.
	
	public String getCategpry() {
		return this.category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	//this.category를 return this.category까지 가능하도록 public을 활용해야함.

}