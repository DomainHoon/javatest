package part04.main2;

public enum Gender {
	MAN(1,"남성"),WOMAN(2,"여성");
	private int value;
	private String name;
	
	Gender(int value, String name) {
		this.value = value;
		this.name = name;
		
	}
	public int getValue() {return value;}
	public String getName() {return name;}

}
