package part01.main3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleSortMain {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);list1.add(3);list1.add(4); list1.add(1); list1.add(2);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		List<String> list2 = new ArrayList<String>();
		list2.add("³ª");list2.add("°¡");list2.add("a");
		list2.add("k");list2.add("D");list2.add("P");
		list2.add("1");list2.add("3");
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);

	}

}
