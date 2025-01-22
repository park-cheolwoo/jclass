package jjbuy;

public class Tv extends Product {
	Tv(){
		this("TV",2000000,20000);
	};
	Tv(String name,int price, int bonusPoint){
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
