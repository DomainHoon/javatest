package part01.main2;

public class TestMain {

	public static void main(String[] args) {
		SingleTonType type1= SingleTonType.getInstance();
		SingleTonType type2= SingleTonType.getInstance();
		if(type1 == type2) {
			System.out.println("a1 ��ü�� a2��ü�� �޸��ּҰ� �����ϴ�.");
		}
		else {
			System.out.println("a1 ��ü�� a2��ü�� �޸��ּҰ� �ٸ��ϴ�.");
		}
			
	}

}

