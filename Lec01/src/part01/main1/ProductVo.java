package part01.main1;

//화면에 나타내지는것들은 이런 초기 형식을 만드는게 중요

public class ProductVo {
	public enum DataType {INSERT,UPDATA,DELETE,NORMAL		
	};
	public static class TableInfo{
		public static final String[] HEADER_NAME_INFO
			= new String[] {"품목번호","품목명", "단가","상태"	};
		public final static int[] WIDTH_INFO = {100,400,100,80};
	}
	private static int count;
	
	static {
		System.out.println("ProductVo-정적 초기화 구간 실행");
		System.out.println("ProductVo-정적 초기화 구간 실행");
	}
	{
		count++;
		System.out.println("ProductVo - 초기화 구간 실행 count["+count+"]");
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
		System.out.println("ProductVo - 생성자 함수[1] 실행");
	}
	public ProductVo(String productName, int price) {
		this.productName = productName;
		this.price = price;
		System.out.println("ProductVo - 생성자 함수[2] 실행");
	}
	public ProductVo(String productNo, String productName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
		System.out.println("ProductVo - 생성자 함수[3] 실행");
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
