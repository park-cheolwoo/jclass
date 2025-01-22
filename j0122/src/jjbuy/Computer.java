package jjbuy;

public class Computer extends Product{
	Computer(){
		this("Computer",1000000,10000);
	};
	Computer(String name,int price, int bonusPoint){
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	};
}
