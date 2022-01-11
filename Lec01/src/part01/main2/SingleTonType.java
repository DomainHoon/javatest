package part01.main2;

public class SingleTonType {
	private static SingleTonType type = null;
	private SingleTonType() {
		
	}
	public static SingleTonType getInstance() {
		if(type == null)
			type = new SingleTonType();
		return type;
	}

}
