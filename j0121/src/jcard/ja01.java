package jcard;

import java.util.Scanner;

public class ja01 {

	public static void main(String[] args) {
		// 52장 카드를 생성 -> 52장 카드를 순차적으로 출력
		Deck d = new Deck();
		
		d.Print_all(52);
		
		// 랜덤으로 섞기를 해서 52장을 출력
		d.shuffle();
		d.Print_all(52);
		
		
		// 0~51까지의 숫자를 입력받아, 해당되는 카드를 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 번호를 입력하세요. >> ");
		int choice = scan.nextInt();
		d.pick(choice);
		
	}

}
