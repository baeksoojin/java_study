//05-1 클래스
package error_study;
//클래스(Class), 객체(Object), 메소드(Method)


public class Animal {	//클래스
	
	String name; //2.객체변수(=인스턴스 변수, 멤버변수, 속성) 생성
	
	public void setName(String name) { //3.메소드 생성
		this.name=name;	//cat, dog, horse에 모두 적용 가능한 객체
		/*
		 cat.name="boby"
		 happy.name="happy"
		 horse.name="hope"
		 */
	}
	
	public static void main(String[] args) {
		Animal cat=new Animal(); //1.Animal의 인스턴스 cat 생성
		Animal dog=new Animal();
		Animal horse=new Animal();
		
		//4.메소드 호출(이름 부여)
		cat.setName("boby");
		dog.setName("happy");
		horse.setName("hope");
		
		//5.이름 출력
		System.out.println(cat.name);
		System.out.println(dog.name);
		System.out.println(horse.name);
	}
}
