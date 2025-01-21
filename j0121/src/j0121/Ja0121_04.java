package j0121;

import java.util.Scanner;

public class Ja0121_04 {

	public static void main(String[] args) {
		// 카드게임
		// 카드게임을 실행합니다.
		// 컴퓨터가 랜덤으로 1개를 뽑고
		// 내가 1~52 카드 중에서 내가 1개를 뽑아서 
		// 무늬가 Spade, Diamond, Heart, Clover
		// 무늬가 같으면 숫자가 높은 사람이 승리
		// 100만원을 지급하는 프로그램을 구현
		
		Card[] c = new Card[52];
		String[] s = {"Spade","Diamond","Heart","Clover"};
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		int[] s2 = {0,1,2,3};
		
		// 52장 만들기
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[13*i+j] = new Card(s[i],j+1);
			}
		}
		//섞기
		while(true) {
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*52);
			Card temp = null;
			temp = c[0];
			c[0] = c[ranNum];
			c[ranNum] = temp;
		}
		// 뽑기 전 변수 초기화
		int ranNum = 0;
		Card temp = null;
		int choice = 0;
		Card myCard = null;
		//컴퓨터 뽑기
			ranNum = (int)(Math.random()*52);
			temp = c[ranNum];
		//내가 뽑기
			System.out.println("원하는 번호를 입력하세요. >> ");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			myCard = c[choice];
		//각자 카드 오픈하기
			System.out.printf("컴퓨터의 카드 : "+c[ranNum]+"\n");
			System.out.printf("나의 카드 : "+c[choice]+"\n");
			
		//비교
			int shape1 = 0;
			int shape2 = 0;
			// 무늬가 다르면 >> 무늬가 높은 사람이 우승
			if(!c[ranNum].shape.equals(c[choice].shape)) {
				for(int i=0;i<4;i++) {
					if(s[i].equals(c[ranNum].shape)) {
						shape1 = i;
					}
					if(s[i].equals(c[choice].shape)) {
						shape2 = i;
					}
				}
				if(shape1<shape2) {
					System.out.println("승리하셨습니다!");}
			}
			// 무늬가 같다면 >> 숫자가 높은 사람이 우승
			if(c[ranNum].shape.equals(c[choice].shape)) {
				if(c[ranNum].number<c[choice].number) {
					System.out.println("승리하셨습니다!");
				}
			}
			
			
		}
			
		}
		
				
}
		
