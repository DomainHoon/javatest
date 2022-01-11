package part07.main3;

import java.lang.reflect.Field;

public class TestMain {

	public static void main(String[] args) {
		ProductVo p = new ProductVo("A001","인삼차",9000);
		try {
			Field field = ProductVo.class.getDeclaredField("price");
			Prices prices = field.getAnnotation(Prices.class);
			Price[] types = prices.value();
			for(Price price: types) {
				System.out.println("[어노테이션 정보]:::"+price);
				double value = price.value();
				String nation = price.currency();
				String unitName = price.currencyName();
				double price2 = 1.0*p.getPrice()/value;
				price2 = (int)(price2*100+0.5)/100.0;
				System.out.println(nation + ":"+price2+" " +unitName);
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
