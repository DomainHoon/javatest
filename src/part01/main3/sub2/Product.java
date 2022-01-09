package part01.main3.sub2;

public class Product implements Comparable<Product> {
	private String productId;
	private String productName;
	private int price;
	public Product(String productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[" + productId + "," + productName + "," + price + "]";
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Product o) {
		return this.productId.compareTo(o.productId);
	}
	

}
