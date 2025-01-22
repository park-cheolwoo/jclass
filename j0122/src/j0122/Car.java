package j0122;

public class Car {
	String color;
	String gearType;
	int door;
	
	void drive() {
		System.out.println("자동차가 출발합니다.");
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
	void setDoor(int door) {
		if(door>0 && door<10) {
			this.door = door;
		}
	}
	
	int getDoor() {
		return door;
	}
	
	String getColor() {
		return color;
	}
	
	
	Car(){}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
