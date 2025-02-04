package j0131;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop_Deck {
	Scanner scan = new Scanner(System.in);
	//user아이디
	Buyer user1;
	ArrayList<Product> list = new ArrayList<Product>(); // 상품구매리스트
	
	//화면출력메소드
	int mainPrint() {
		System.out.println("    [ 쇼핑몰 프로그램 ]");
		System.out.println("-------------------------");
		System.out.println("1. 50인치 LED TV");
		System.out.println("2. 75인치 LED TV");
		System.out.println("3. 노트북");
		System.out.println("4. 냉장고");
		System.out.println("5. 세탁기");
		System.out.println("7. 구매한 리스트보기");
		System.out.println("8. 현금충전");
		System.out.println("9. 상품등록 - 관리자");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		int choice = scan.nextInt();
		return choice;
	}//mainPrint
	
	//구매메소드
	void buy(Product p){
		p.getPrice(); //제품금액
		p.getPoint(); //제품보너스 포인트
		user1.setMoney(user1.getMoney()-p.getPrice()); // user의 가지고 있는 금액 - 제품금액
		user1.setMyPoint(user1.getMyPoint()+p.getPoint()); //포인트는 추가
		list.add(p);
		System.out.println("[ 구매상품 ]");
		System.out.println("상품 : "+p.getName());
		System.out.printf("상품금액 : %,d 원 \n",p.getPrice());
		System.out.printf("현재잔액 : %,d 원 \n",user1.getMoney());
		System.out.println("------------------------------");
		System.out.println("상품을 구매하였습니다.");
		
	}
	
	
	//로그인 메소드
	void login() {
		while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("로그인을 하셔야 쇼핑몰 프로그램에 들어갈수 있습니다.");
			System.out.println("< 로그인 >");
			System.out.println("아이디 : ");
			String id = scan.next();
			System.out.println("패스워드 : ");
			String pw = scan.next();
			if(id.equals("admin") && pw.equals("1111")) {
				//db접근
				user1 = new Buyer("admin","1111","관리자","서울",100000000,10000000);
				System.out.printf("               [ %s 회원정보 ]\n ",user1.getUserName());
				System.out.println("------------------------------------------");
				System.out.println(id +"님이 로그인 되었습니다!");
				System.out.printf("현재충전금액 : %,d 원 \n",user1.getMoney());
				break;
			}else {
				System.out.println("아이디 또는 패스워드가 일치 하지 않습니다!");
			}
		}//while
	}//login

}
