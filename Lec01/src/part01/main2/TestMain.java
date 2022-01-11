package part01.main2;

public class TestMain {

	public static void main(String[] args) {
		SingleTonType type1= SingleTonType.getInstance();
		SingleTonType type2= SingleTonType.getInstance();
		if(type1 == type2) {
			System.out.println("a1 객체와 a2객체는 메모리주소가 같습니다.");
		}
		else {
			System.out.println("a1 객체와 a2객체는 메모리주소가 다릅니다.");
		}
			
	}

}

