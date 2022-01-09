package part02.main2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSortMain {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();			//입력된값을 오름차순으로 정렬하여 저장
		set1.add(5);
		set1.add(3);
		set1.add(4);
		set1.add(1);
		set1.add(2);
		System.out.println(set1);
		Set<String> set2 = new HashSet<String>();
		set2.add("나");	set2.add("다");	set2.add("a");	set2.add("k");
		set2.add("D");	set2.add("P");	set2.add("1");	set2.add("3");
		System.out.println(set2);
		List<String> list2 = new ArrayList<String>(set2);	//list를 선언
		Collections.sort(list2);							//list타입을 받기때문에
	}

}
