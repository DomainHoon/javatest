package part01.main1;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		System.out.println(list1);
		
		list1.add("a");					//자료등록;
		list1.add("b");				
		list1.add("c");				
		list1.add("d");
		System.out.println(list1);
		
		list1.set(0, "A");
		list1.set(1, "B");
		System.out.println(list1);
		
		list1.remove(0);
		System.out.println(list1);
		
		list1.remove("c");
		System.out.println(list1);
		
		System.out.println("[자료포함 여부 'B'] :" + list1.contains("B"));
		
		List<String> list2 = list1;
		System.out.println("list2 == list1 :"+ (list1 == list2));

		List<String> list3 = list1;
		System.out.println("list3 == list1 :"+ (list3 == list2));
	}

}
