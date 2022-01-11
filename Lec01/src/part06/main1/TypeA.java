package part06.main1;

public class TypeA {
	private String name ="이름 속성";
	public TypeA() {	}
	public TypeA(String name) {	this.name = name;	}
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public static void metho1() {
		System.out.println("TypeA.method1() - static method1 함수 호출");
	}
	
}
