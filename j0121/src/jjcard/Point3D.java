package jjcard;

public class Point3D extends Point {
	int z;
	Point3D(int x,int y, int z){
//		super(x, y); // 부모에 있는 생성자를 호출하면 에러가 나지 않음, 또는 부모에 기본생성자 생성해야함
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return  "x : "+x+","+"y : "+y+"z : "+z;
	}
}
