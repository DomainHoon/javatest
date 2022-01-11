package part07.main2;

import java.lang.reflect.Field;
import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) throws Exception {
		Class<ProductVo> clazz = ProductVo.class;
		
		Field field1 = clazz.getDeclaredField("productNo");
		Anno1 anno1 = field1.getAnnotation(Anno1.class);
		System.out.println(anno1.name()+":"+anno1.value()+":"
				+ anno1.child()+":"+anno1.dataType());
		Anno2 anno2 = field1.getAnnotation(Anno2.class);
		System.out.println(Arrays.toString(anno2.names())+":"
				+ Arrays.toString(anno2.values())+":"
				+ Arrays.toString(anno2.children())+":"
				+ Arrays.toString(anno2.dataTypes()));
		for(Child c:anno2.children()) {
			System.out.println(c.value()+ " ");
		}
		System.out.println();
	
	}

}
