package jjcard;

public class Card {
	
	
	Card(){
		shape = 0;
		number = 1;
	}
	
	Card(int shape, int number){
		this.shape = shape;
		this.number = number;
	}
	
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"Diamond","Heart","Clover","Spade"};
	int shape;
	int number;

	
	@Override
	public String toString() {
		return String.format("[%s,%s]",s[shape],n[number]);
	}

	
	// 자바 : this / Class(){}
	// 파이썬 : self / __init__ 
	
}

