package part05.main3;

public class TestMain {

	public static void main(String[] args) {
		TypeB<TypeA<String>> typeB = new TypeB<TypeA<String>>();
		TypeC<TypeA<Object>> typeC = new TypeC<TypeA<Object>>();
		//TypeC<TypeA<Object>> typeC2 = new TypeC<TypeA<String>>(); x
		TypeD<TypeA<String>> typeD = new TypeD<TypeA<String>>();
		TypeD<TypeA<Object>> typeD2 = new TypeD<TypeA<Object>>();
	}

}
