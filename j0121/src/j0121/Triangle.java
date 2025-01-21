package j0121;

public class Triangle extends Shape {
	
	
	// 생성자
	Triangle(){};
	Triangle(Point[] p){
		this.p = p;
	};
	Triangle(Point p1, Point p2, Point p3){
		p = new Point[] {p1,p2,p3};
	};
	
	Point[] p;
	
}
