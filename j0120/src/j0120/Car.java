package j0120;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("black","auto",4);		
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
}
