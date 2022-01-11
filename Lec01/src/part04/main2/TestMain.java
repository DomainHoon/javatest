package part04.main2;

public class TestMain {

	public static void main(String[] args) {
		Gender gender1 = Gender.MAN;
		int value1 = gender1.getValue();
		String name1 = gender1.getName();
		System.out.println(value1+":"+name1);
		
		Gender gender2 = Gender.WOMAN;
		System.out.println(gender2.getValue()+":"+gender2.getName());
	}

}
