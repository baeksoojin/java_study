package java_study;

public class Calc<T,I> {
	
	// 주로 형변환과 instanceof를 사용함.
	
	@SuppressWarnings("unchecked")
	public T Sum(T[] array) {
		
		if(array[0] instanceof Integer) {
			Integer sum=0;
			for(int i=0; i<array.length; i++) {
				sum += (Integer)array[i];
			}
			T sum2 = (T)sum;
			return sum2;
		}
		if(array[0] instanceof Double) {
			Double sum=0.0;
			for(int i=0; i<array.length; i++) {
				sum += (Double)array[i];
			}
			T sum2 = (T)sum;
			return sum2;
		}
		return null;
	}
	@SuppressWarnings("unchecked")
	public T Avg(T sum, I n) {
		
		if(sum instanceof Integer) {
			Integer avg = (Integer)sum/(Integer)n;
			T avg2 = (T)(avg);
			return avg2;
		}
		if(sum instanceof Double) {
			
			Double avg = (Double)sum/(Integer)n;
			T avg2 = (T)avg;
			return avg2;
		}	
		return null;
	}
	
	
	public static void main(String[] args) {
		
		Integer[] int_array = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		Double[] double_array = new Double[] {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0,16.0,17.0,18.0,19.0,20.0};
		
		Calc<Integer,Integer> int_calc = new Calc<Integer,Integer>();
		Calc<Double,Integer> double_calc = new Calc<Double,Integer>();
		
		Integer n = (Integer)int_array.length;
		
		System.out.println("Integer의 sum: "+int_calc.Sum(int_array));
		System.out.println("Double의 sum: "+double_calc.Sum(double_array));
		System.out.println("Integer의 avg: "+int_calc.Avg(int_calc.Sum(int_array),n));
		System.out.println("Double의 avg: " + double_calc.Avg(double_calc.Sum(double_array),n));	
		
		
		
	}

}
