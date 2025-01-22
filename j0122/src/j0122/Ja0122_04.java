package j0122;

public class Ja0122_04 {

	public static void main(String[] args) {
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		Ambulance a = null;
		Ambulance a2 = new Ambulance();
		fe.water();
		
		c = fe;
//		c.water(); // 에러 - 공간은 있지만 출력은 되지 않음
		fe2 = (FireEngine)c;
		fe2.water();
		
//		a = (Ambulance)c;
//		a.siren(); // 에러
		
		if( c instanceof FireEngine){
			fe2 = (FireEngine)c;
			fe2.water();
		}else if(c instanceof Ambulance) {
			a = (Ambulance)c;
			a.siren();
		}
		
	}

}
