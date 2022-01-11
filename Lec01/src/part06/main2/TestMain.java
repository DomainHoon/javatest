package part06.main2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMain {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("part06.main2.ProductVo");
		Constructor constructor = clazz.getDeclaredConstructor(String.class);
		
		Object obj = constructor.newInstance("�׽�Ʈ2",2);
		System.out.println("��ü ���� :" +obj);
		Field field = clazz.getDeclaredField("productName");
		boolean isAccessible = field.canAccess(obj);
		System.out.println("productName isAccessible :" +isAccessible);
		field.setAccessible(true);
		System.out.println("productName"+field.get(obj));
		field.set(obj,"�׽�Ʈ3");
		System.out.println("productName"+field.get(obj));
		field.setAccessible(isAccessible);
		
		Method method = clazz.getDeclaredMethod("getPrice");
		Object returnVal1 = method.invoke(obj);
		System.out.println("getPrice() call :::" + returnVal1);
	}

}
