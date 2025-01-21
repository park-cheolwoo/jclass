package j0121;

public class Card {
	// 카드 1장
	Card(){ this("Null",0); };
	Card(String shape, int number){
		this.shape = shape;
		this.number = number;
	}
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"Spade","Diamond","Heart","Clover"};
	int number;
	String shape;
	
	@Override
	public String toString() {
		String p = "[ "+shape+","+n[number]+" ]";
		return "[ "+shape+","+n[number]+" ]";
	};
}
