package star;

abstract public class Unit {
	int x,y;
	abstract void move(int x, int y); // 추상 메소드
	
	void stop() {
		System.out.println("자리에 멈춤!!");
	}; 
}
