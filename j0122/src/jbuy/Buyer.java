package jbuy;
import java.util.ArrayList;
class Buyer {
	
	int money=10000000;  //보유한 현금 :1천만원
	int bonusPoint=0;    //보유한 보너스포인트
	int total = 0;       //총구매금액
//	Product[] cart = new Product[10]; //배열선언
	ArrayList list = new ArrayList();
	
	
	//생성자
	Buyer(){}
	Buyer(int money,int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	// 나의정보메소드
	void myInfo() {
		System.out.printf("[ 보유금액 : %,d ]\n",money);
		System.out.printf("[ 보유포인트 : %,d ]\n",bonusPoint);
	}
	
	//구매 메소드
	void buy(Product p) {
		list.add(p);
		money -= p.price;
		bonusPoint += p.bonusPoint;
		total += p.price;  //총구매금액
	}
	
	void cartInfo() {
		System.out.print("구매목록 : ");
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s ",((Product)list.get(i)).name);
		}
		System.out.println();
		System.out.printf("구매개수 : %d 개 \n",list.size());
		System.out.printf("총구매금액 : %,d 원 \n",total);
	}
	
	void aaa() {} // 완성된 메소드
//	void bbb() // 미완성
	
	
	
//	void buy(Tv t) {
//		System.out.println("TV를 구매합니다.");
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Computer c) {
//		System.out.println("컴퓨터를 구매합니다.");
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	void buy(Audio a) {
//		System.out.println("컴퓨터를 구매합니다.");
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
	
	
}
