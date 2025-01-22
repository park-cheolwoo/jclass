package jjbuy;

import java.util.Scanner;

public class JJaMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 로그인 구현
		// 보유금액, 보너스포인트가 설정
		Buyer b = new Buyer();
		System.out.printf("현재보유금액 : %,d \n",b.money);
		System.out.printf("보유포인트 : %,d \n",b.point);
		
		loop:while(true) {			
		System.out.println(" [ 전자제품 쇼핑몰 ] ");
		System.out.println("1. TV ");
		System.out.println("2. COMPUTER ");
		System.out.println("3. AUDIO ");
		System.out.println("9. 구매(cart)정보보기 ");
		System.out.println("0. 프로그램 종료");
		System.out.println("구매를 원하는 번호를 입력하세요. >> ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			b.buy(new Tv());
			b.myInfo();
			break;
		case 2:
			b.buy(new Computer());
			b.myInfo();
			break;
		case 3:
			b.buy(new Audio());
			b.myInfo();
			break;
		case 9:
			b.cartInfo();
		case 0:
			break loop;
			
		}
		}
	}

}
