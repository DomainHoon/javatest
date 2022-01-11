package part06.main1;

public class TestMain1 {

	public static void main(String[] args) {
		TypeA a1 = new TypeA();
		System.out.println("name:" +a1.getName());
		a1.setName("name2");
		System.out.println("name:" +a1.getName());
		TypeA a2= new TypeA("name3");
		System.out.println("name:" +a2.getName());
		TypeA.metho1();

	}

}
