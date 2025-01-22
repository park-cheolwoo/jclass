package j0122;

//import Stu.Shape;

public class Ja0122_01 {

	public static void main(String[] args) {
		Time t1 = new Time(12,05,10);
		System.out.println(t1.getHour());
		t1.setHour(t1.getHour()+1);
		System.out.println(t1.getHour());

		System.out.println();
		t1.setHour(13);
		t1.setMinute(35);
		t1.setSecond(30);
		System.out.println(t1.getHour());
		System.out.println(t1.getMinute());
		System.out.println(t1.getSecond());
		
		
		// private - 같은 클래스, default - 같은 클래스, 같은 패키지, protected - 같은 클래스, 같은 패키지, 자손 클래스, public - 전체
		Car c = new Car();
//		System.out.println(c.color); // 에러 - private 는 같은 클래스에서 접근가능
		Car c2 = new Car("white","auto",5);
		c2.setDoor(-50);
		System.out.println(c2.getColor()); // null
//		Shape s = new Shape(); // 에러
//		s.draw();
	}

}
