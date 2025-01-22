package j0122;

public class Singleton {
	// private - 같은 클래스
	private static Singleton s = new Singleton();
	private Singleton(){}
	private int num;
	
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
	
	
	public static Singleton getInstance() {
		return s;
	}
	
	
}
