package part07.main1;

public class ProductVo {
	@Grid(name="ǰ���ȣ",width=100, order=1)
	private String productNo;
	@Grid(name="ǰ���",width=400, order=2)
	private String productName;
	@Grid(name="�ܰ�",width=200, order=3)
	private int price;
	public ProductVo(String productNo, String productName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}

}

