package part01.main1;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("ProductVo ¸Ó¸®±Û - " + 
				Arrays.toString(ProductVo.TableInfo.HEADER_NAME_INFO));
		ProductVo v1 = new ProductVo("ÀÎ»ïÂ÷",9000);
		ProductVo v2 = new ProductVo("³ìÂ÷",6000);
		System.out.println(v1);
		System.out.println(v2);
		
		v2.setProductNo("B002");
		System.out.println(v2);
		
	}

}
