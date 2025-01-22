package jjbuy;

import java.util.ArrayList;

public class Buyer {
	int money;
	int point;
	ArrayList cart = new ArrayList();
	int total = 0;
	
	Buyer(){
		this(10000000,0);
	};
	Buyer(int money, int point){
		this.money = money;
		this.point = point;
	}
	
	
	void buy(Product p) {
		System.out.printf(" [ %s 구매 ] \n",p.name);
		money -= p.price;
		point += p.bonusPoint;
		cart.add(p);
		total += p.price;
		System.out.println("물품을 구매하였습니다.");
	}
	
	void myInfo() {
		System.out.printf("구매 개수 : %d \n",cart.size());
		System.out.printf("잔여 금액 : %,d \n",money);
	}
	
	void cartInfo() {
		System.out.println(" [ 구매내역 출력 ] ");
		for(int i=0;i<cart.size();i++) {
			System.out.printf("%s \t",((Product)(cart.get(i))).name);
		}
		System.out.println();
		System.out.printf("금액 합계 : %,d \n",total);
		System.out.printf("구매 개수 : %d \n",cart.size());
	}
}
