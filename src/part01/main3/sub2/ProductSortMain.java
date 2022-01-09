package part01.main3.sub2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSortMain {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("P001","인삼차",9000));
		list.add(new Product("P002","까페모카",7000));
		list.add(new Product("P003","아메리카노",4000));
		list.add(new Product("P004","키위쥬스",6500));
		System.out.println(list);
		Collections.sort(list, new Comparator<Product>(){

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o2.getProductName().compareTo(o1.getProductName());
			}
			
		});
		System.out.println(list);
		Collections.sort(list, new Comparator<Product>(){

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o1.getPrice() - o2.getPrice();
			}
			
		});
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
