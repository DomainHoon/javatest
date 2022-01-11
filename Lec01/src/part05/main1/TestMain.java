package part05.main1;

public class TestMain {

	public static void main(String[] args) {
		TypeB b = new TypeB();
		String method1 = b.method1("테스트1");
		String method2 = TypeB.method2("테스트2");
		
		System.out.println(method1);
		TypeA<Integer> b1 = new TypeA<Integer>(100);
		TypeA<String> a1 = new TypeA<String>("1");
		String t1 = a1.getT();
		String method3 = b.method3(a1);
		String method4 = TypeB.method4(a1);
		System.out.println(method3);
		System.out.println(method4);

		TypeA a2 = new TypeA("2");
		Object t2 = a2.getT();
		Object method5 = b.method3(a2);
		Object method6 = TypeB.method4(a2);
	}

}
