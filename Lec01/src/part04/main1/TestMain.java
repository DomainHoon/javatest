package part04.main1;

import part04.main1.TypeA.GenderType;

public class TestMain {

	public static void main(String[] args) {
		TypeA a = new TypeA();
		
		a.setGenderType(GenderType.MAN);
		if(a.getGenderType() == GenderType.MAN) {
			System.out.println("��ü �� [����]");
		}
		else if (a.getGenderType() == GenderType.WOMAN) {
			System.out.println("��ü �� [����]");
		}else
			System.out.println("�񱳺Ұ�");
	}

}
