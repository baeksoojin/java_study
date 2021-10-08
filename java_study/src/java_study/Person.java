package java_study;

public class Person {
	
	String personName;
	String birthDate;
	String homeAddress;
	
	public Person(String n, String date, String address){
		personName = n;
		birthDate = date;
		homeAddress = address;
	}
	
	public String getName() {
		return personName;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public String setName(String name) {
		personName = name;
		return personName;
	}
	
	public String setBirthDate(String date) {
		birthDate = date;
		return birthDate;
	}

}

