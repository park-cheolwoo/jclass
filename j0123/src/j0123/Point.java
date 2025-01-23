package j0123;

public class Point implements Cloneable {
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	
	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return String.format("[%d,%d]",x,y);
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO 자동 생성된 메소드 스텁
		return super.clone();
	}
}
