package error_study;

// soorim
public class Person {
	String personName;
	String birthDate; //yyyy/mm/dd 포멧
	String homeAddress;
	
	public Person(String n, String date, String address) { //Person의 생성자
		this.personName=n;
		this.birthDate=date;
		this.homeAddress=address;
	}
	
	public void print() {
		System.out.println(this.personName+this.birthDate+this.homeAddress);
	}
	
	public String getName() {
		return personName;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	void setName(String n) {
		personName=n;
	}
	
	void setBirthDate(String bd) {
		birthDate=bd;
	}
}
