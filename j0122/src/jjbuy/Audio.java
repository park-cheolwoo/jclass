package jjbuy;

public class Audio extends Product{
	
	
	Audio(){
		this("Audio",500000,5000);
	}
	Audio(String name,int price, int bonusPoint){
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
