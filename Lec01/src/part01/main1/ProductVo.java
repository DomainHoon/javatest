package part01.main1;

//ȭ�鿡 ��Ÿ�����°͵��� �̷� �ʱ� ������ ����°� �߿�

public class ProductVo {
	public enum DataType {INSERT,UPDATA,DELETE,NORMAL		
	};
	public static class TableInfo{
		public static final String[] HEADER_NAME_INFO
			= new String[] {"ǰ���ȣ","ǰ���", "�ܰ�","����"	};
		public final static int[] WIDTH_INFO = {100,400,100,80};
	}
	private static int count;
	
	static {
		System.out.println("ProductVo-���� �ʱ�ȭ ���� ����");
		System.out.println("ProductVo-���� �ʱ�ȭ ���� ����");
	}
	{
		count++;
		System.out.println("ProductVo - �ʱ�ȭ ���� ���� count["+count+"]");
		if(count <10)
			this.productNo = "A00"+count;
		else if(count < 100)
			this.productNo = "A0"+count;
		else this.productNo = "A"+count;			
		System.out.println("ProductVo - productNo["+this.productNo+"]");
	}	
	private String productNo;
	private String productName;
	private int price;
	
	public ProductVo(String productNo) {
		System.out.println("ProductVo - ������ �Լ�[1] ����");
	}
	public ProductVo(String productName, int price) {
		this.productName = productName;
		this.price = price;
		System.out.println("ProductVo - ������ �Լ�[2] ����");
	}
	public ProductVo(String productNo, String productName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
		System.out.println("ProductVo - ������ �Լ�[3] ����");
	}
	public String getProductNo() {return this.productNo;}
	public void setProductNo(String productNo) {this.productNo = productNo;}
	public String getProductName() {		return this.productName;	}
	public void setProductName(String productName) {		this.productName = productName;	}
	public int getPrice() {		return this.price;	}
	public void setPrice(int price) {		this.price = price;	}
	
	@Override
	public String toString() {
		return this.productNo + ":" + this.productName+":"+this.price;
	}
	public String[] getData() {
		return new String[] {this.productNo,this.productName,
				""+this.price};
	}

}
