//05-1 Ŭ����
package error_study;
//Ŭ����(Class), ��ü(Object), �޼ҵ�(Method)


public class Animal {	//Ŭ����
	
	String name; //2.��ü����(=�ν��Ͻ� ����, �������, �Ӽ�) ����
	
	public void setName(String name) { //3.�޼ҵ� ����
		this.name=name;	//cat, dog, horse�� ��� ���� ������ ��ü
		/*
		 cat.name="boby"
		 happy.name="happy"
		 horse.name="hope"
		 */
	}
	
	public static void main(String[] args) {
		Animal cat=new Animal(); //1.Animal�� �ν��Ͻ� cat ����
		Animal dog=new Animal();
		Animal horse=new Animal();
		
		//4.�޼ҵ� ȣ��(�̸� �ο�)
		cat.setName("boby");
		dog.setName("happy");
		horse.setName("hope");
		
		//5.�̸� ���
		System.out.println(cat.name);
		System.out.println(dog.name);
		System.out.println(horse.name);
	}
}
