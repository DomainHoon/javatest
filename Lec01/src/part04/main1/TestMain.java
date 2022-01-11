package part04.main1;

import part04.main1.TypeA.GenderType;

public class TestMain {

	public static void main(String[] args) {
		TypeA a = new TypeA();
		
		a.setGenderType(GenderType.MAN);
		if(a.getGenderType() == GenderType.MAN) {
			System.out.println("객체 비교 [남성]");
		}
		else if (a.getGenderType() == GenderType.WOMAN) {
			System.out.println("객체 비교 [여성]");
		}else
			System.out.println("비교불가");
	}

}
