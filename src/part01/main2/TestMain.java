package part01.main2;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		ArrayList<Member> list1 = new ArrayList<Member>();
		list1.add(new Member("A001","ȫ�浿"));
		list1.add(new Member("A002","�ڸ��"));
		System.out.println(list1);
		
		ArrayList<Member> list2 = (ArrayList<Member>) list1.clone();
		System.out.println(list2);
		/*
		for(Member m : list1)
			list2.add((Member) m.clone());
			*/
		
		list1.get(1).setMemberName("������");
		System.out.println(list1);
		System.out.println(list2);

	}

}

