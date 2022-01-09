package part02.main1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		Set set1 = new HashSet();
		Set set2 = new TreeSet();
		Set set3 = new LinkedHashSet();
		
		Set<String> set4 = new HashSet<String>();
		Set<String> set5 = new TreeSet<String>();
		Set<String> set6 = new LinkedHashSet<String>();
		
		Set<String> set = new HashSet<String>();
		set.add("a");set.add("b");set.add("c");set.add("d");
		System.out.println(set);
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		for(String data:set) {
			System.out.print(data + " ");
		}
		System.out.println();
		set.remove("a");
		System.out.println(set);

	}

}
