package sec03.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorageExample {
	private List<Product> list = new ArrayList<Product>();
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	public void showMenu() throws Exception {
		while(true) {
			System.out.println(":===================");
			System.out.println("1.등록    2.목록    3.종료");
			System.out.println(":===================");
			System.out.println("선택>> ");
			String selectNo = scanner.nextLine();
			switch(selectNo) {
			case "1": registerProduct();break;
			case "2": this.showProduct();break;
			case "3": storeProduct(); return;				
			}
		
		}
	}
	public void storeProduct() throws Exception {
		FileOutputStream fos = new FileOutputStream("./products.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush(); oos.close(); fos.close();
	}
	public void registerProduct() {
		try {
		Product product = new Product();
		System.out.println("상품명>> ");
		product.setName(scanner.nextLine());
		System.out.println("가격>> ");
		System.out.println(Integer.parseInt(scanner.nextLine()));
		System.out.println("재고>> ");
		product.setStock(Integer.parseInt(scanner.nextLine()));
		list.add(product);
	}catch (Exception e) {
		System.out.println("등록에러"+e.getMessage());
	}
}

	public void showProduct() {
		for(Product p:list)System.out.println(p);
		
	}
	
	public static void main(String[] args) throws Exception{
		ProductStorageExample ps = new ProductStorageExample(); 
		ps.showMenu();
		System.out.println("프로그램종료"); 
		
		
		}
		
		

	}

