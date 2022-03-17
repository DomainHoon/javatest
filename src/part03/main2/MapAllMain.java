package part03.main2;

import java.util.HashMap;
import java.util.Map;

public class MapAllMain {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "a");map1.put("2", "b");map1.put("3", "c");					//같은 값을 넣으면 덮어씌움	
		map1.put("4", "d");
		System.out.println(map1);
		
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("1", "a");map2.put("2", "f");map2.put("5", "g");map2.put("6", "h");
		System.out.println(map2);
		map1.putAll(map2);
		System.out.println(map1);
		for(String value: map1.values()) 
			System.out.print(value + " ");
		System.out.println();
		
		map1.clear();
		map1.put("1", "a");map1.put("2", "b");map1.put(null, "e");map1.put("3", null);
		System.out.println(map1);
		System.out.println(map1.keySet());
		System.out.println(map1.containsKey("3"));
		System.out.println(map1.containsKey(null));
		System.out.println(map1.containsKey("4"));
		System.out.println("========================");
		System.out.println(map1.values());
		System.out.println(map1.containsValue("a"));
		System.out.println(map1.containsValue(null));
		System.out.println(map1.containsValue("f"));
		
	}

}
