package part04.main1;

import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("1", "a");
		prop.put("2", "b");
		prop.put("3", "c");
		prop.put("4", "d");
		prop.put("5", "e");
		System.out.println(prop);
		prop.put("3", "f");
		System.out.println(prop);
		for(Object o : prop.keySet())
			System.out.println(o +":"+prop.get(o));
		System.out.println("===============");
		System.out.println(prop.getProperty("1"));
		System.out.println(prop);

	}

}

