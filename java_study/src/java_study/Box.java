package java_study;

public class Box<T> {
	private T t;
	public void add(T t) {
		this.t= t;	}
	
	public T get() {
		return t;
	}
	
	@SuppressWarnings("removal")
	public static void main(String args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.add(new Integer(2019));
		stringBox.add(new String("string Áö³×¸¯"));
		
		System.out.printf("integer : %d \n\n",integerBox.get());
		System.out.printf("String : %s \n\n",stringBox.get());
		
		
	}

}
