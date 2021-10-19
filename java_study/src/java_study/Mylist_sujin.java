package java_study;

import java.util.*;

public class Mylist_sujin {
	public static void main(String[] args) {
		
		//ArrayList() => 삽입될 자료만큼 크기를 늘리며 할당된 크기는 줄지 않음.
		List a1 = new ArrayList();
		a1.add("수성 ");
		a1.add("화성 ");
		a1.add("지구 ");
		
		System.out.println(" ArrayList ");
		System.out.print(a1);
		
		a1.remove(1);
		System.out.print("\n" + a1);
		System.out.print("\n" + a1.get(1));
		//a1.remove(1)을 해도 1이 있던 곳이 비어있지 않음. => 앞으로 당겨짐
		
		a1.add(1,"금성을 지구가 있던 곳 1의 위치에 추가");
		System.out.print("\n" + a1.get(1));
		System.out.print("\n" + a1);
		//add(위치,추가할값)으로 1에 위치하던 값을 하나씩 미룸.
		
		//LinkedList() => c에서 연결리스트 자료구조를 표현한 것처럼 연결된 화살표 사이에 추가로 node를 넣어 이어주는 작업을한다.
		List l1 = new LinkedList();
		 l1.add("수성 ");
		 l1.add("화성 ");
		 l1.add("지구 ");
		 System.out.println("\n");
		 System.out.println(" LinkedList ");
		 System.out.print(l1);
		 l1.remove(1);
		 System.out.print("\n" +l1.get(1));
		 System.out.print("\n" + l1);
		 l1.add(1,"금성이 ㅣ1의 1의 위치에 들어갑니다.");
		 System.out.print("\n" + l1);
		
		

		
	}
}
