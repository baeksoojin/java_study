package java_study;

import java.util.*;

public class Mylist_sujin {
	public static void main(String[] args) {
		
		//ArrayList() => ���Ե� �ڷḸŭ ũ�⸦ �ø��� �Ҵ�� ũ��� ���� ����.
		List a1 = new ArrayList();
		a1.add("���� ");
		a1.add("ȭ�� ");
		a1.add("���� ");
		
		System.out.println(" ArrayList ");
		System.out.print(a1);
		
		a1.remove(1);
		System.out.print("\n" + a1);
		System.out.print("\n" + a1.get(1));
		//a1.remove(1)�� �ص� 1�� �ִ� ���� ������� ����. => ������ �����
		
		a1.add(1,"�ݼ��� ������ �ִ� �� 1�� ��ġ�� �߰�");
		System.out.print("\n" + a1.get(1));
		System.out.print("\n" + a1);
		//add(��ġ,�߰��Ұ�)���� 1�� ��ġ�ϴ� ���� �ϳ��� �̷�.
		
		//LinkedList() => c���� ���Ḯ��Ʈ �ڷᱸ���� ǥ���� ��ó�� ����� ȭ��ǥ ���̿� �߰��� node�� �־� �̾��ִ� �۾����Ѵ�.
		List l1 = new LinkedList();
		 l1.add("���� ");
		 l1.add("ȭ�� ");
		 l1.add("���� ");
		 System.out.println("\n");
		 System.out.println(" LinkedList ");
		 System.out.print(l1);
		 l1.remove(1);
		 System.out.print("\n" +l1.get(1));
		 System.out.print("\n" + l1);
		 l1.add(1,"�ݼ��� ��1�� 1�� ��ġ�� ���ϴ�.");
		 System.out.print("\n" + l1);
		
		

		
	}
}
