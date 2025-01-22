package j0122;

import java.util.ArrayList;

public class Ja0122_06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Car("white","auto",5));
		list.add(new Car("red","stick",4));
		list.add(new Car("blue","auto",4));
		list.add(new Car("yellow","stick",6));
		list.add(new Car("green","auto",4));

		for(int i=0;i<list.size();i++) {	
			Car c = (Car)(list.get(i));
//		System.out.println(((Car)(list.get(i))).color);
			System.out.printf("[%s,%s,%d]\n",c.color,c.gearType,c.door);
		}
	}

}
