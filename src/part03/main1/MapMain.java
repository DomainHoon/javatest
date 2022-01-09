package part03.main1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

	public static void main(String[] args) {
		Map map1 = new HashMap();
		Map map2 = new TreeMap();
		Map map3 = new LinkedHashMap();
		
		Map<String, Integer> map4 = new HashMap<String, Integer>();
		Map<String, Integer> map5 = new TreeMap<String, Integer>();
		Map<String, Integer> map6 = new LinkedHashMap<String, Integer>();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println(map);
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		System.out.println(map);
		System.out.println(map.get("c"));
		for(String key:map.keySet())
			System.out.println("key["+key+"],value["+map.get(key)+"]");
		map.put("a", 11);
		map.put("e", 20);
		System.out.println(map.get("c"));
		for(String key:map.keySet())
			System.out.println("key["+key+"],value["+map.get(key)+"]");
		System.out.println("==============");
		map.remove("e");
		for(String key:map.keySet())
			System.out.println("key["+key+"],value["+map.get(key)+"]");
		System.out.println("key a의 존재여부 : "+map.containsKey("a"));
		System.out.println("value 11 의 존재여부 : "+map.containsValue(11));
	}

}
