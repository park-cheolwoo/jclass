package j0122;

import java.util.ArrayList;

public class Ja0122_05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Car c = new Car();
		c.color = "red";
		c.gearType = "auto";
		c.door = 4;
		c.getColor();
		list.add(c); //Object
		list.add(new Car("white","stick",5)); // Object c2 = new Car("white","stick",5);
		System.out.println("개수 : "+list.size());
		Car car = (Car)list.get(0);
		System.out.println("0번째 데이터 : "+car.color);
		
		Car c2 = (Car)list.get(1);
		System.out.println("1번째 데이터 : "+c2.color);
		
	}

}
