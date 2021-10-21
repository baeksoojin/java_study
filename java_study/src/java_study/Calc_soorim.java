public class Calc_soorim <T>{
    
    public static <T extends Number> double Sum(T[] arr) {
		double result=0.0;
		for(int i=0; i<arr.length; i++) {
			result+=Double.parseDouble(arr[i]+"");	//문자열에서 double형으로 바꾸는 방법. -> 제네릭을 사용하면 해당 배열을 문자열로 인식한다.
		}
		return result;
	}
	
//	public static <T extends Number> Double Sum2 (T[] arr) {
//		Double result=0.0;
//		for(int i=0; i<arr.length; i++) {
//			result+=(Double)(arr[i]);
//		}
//		return result;
//	}
	
	public static <T extends Number> double Average(T[] arr) {
		double result=0.0;
		for(int i=0; i<arr.length; i++) {
			result+=Double.parseDouble(arr[i]+"");	//문자열에서 double형으로 바꾸는 방법
		}
		result=result/arr.length;
		return result;
	}

//	public static <T extends Number> Double Average2 (T[] arr) {
//		Double result=0.0;
//		for(int i=0; i<arr.length; i++) {
//			result+=(Double)(arr[i]);	//문자열에서 double형으로 바꾸는 방법
//		}
//		result=result/arr.length;
//		
//		return result;
//	}

	
	public static void main(String[] args) {
		Integer[] intArr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		Double[] doubleArr= {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0,16.0,17.0,18.0,19.0,20.0};
		
//		number1<String> c=new number1<String>();  인스턴스 생성
//		number1<Integer> i=new number1<Integer>();
		
//		System.out.println(c.Sum(intArr));	//의문) string 인데 왜 extends Number를 사용했는데 실행이 되는걸까?
//		System.out.println(number1.Sum(intArr)); //실행함.
		
		//형변환을 할거면, [] 앞에 있는 Double, Integer을 사용해서 형변환을 해야 함.
		
		System.out.printf("int형 배열의 합: %d\n", (int)Sum(intArr));	//형변환. 반올림(Math.round())으로도 형변환 가능.
		System.out.printf("int형 배열의 평균: %.2f\n", Average(intArr));
		System.out.printf("double형 배열의 합: %.2f\n", Sum(doubleArr));
		System.out.printf("double형 배열의 합: %.2f\n", Average(doubleArr));

	}
}

//클래스명에서 제네릭을 사용하면 클래스명에는 static 사용 불가. 클래스 안의 메서드에서는 static, 제네릭 사용 가능
//클래스명에서 제네릭을 사용하면 메서드에서 static 안쓰고 제네릭은 사용 가능
//클래스명에서 제네릭을 안쓰면 메인에서 객체 생성 후, 그냥 메서드에서 제네릭을 사용 가능.
//static과 객체는 둘 중 하나만 사용 가능.
