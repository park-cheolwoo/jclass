package jcard;

import java.util.Scanner;

public class Deck {
	Card[] c = new Card[52];
	String[] shape = {"Spade","Clover","Heart","Diamond"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};

	Deck(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[13*i+j] = new Card(shape[i],j+1);
			}
		}
	}
	
	void Print_all(int no) {
		System.out.printf(" [ %d개 출력 ] \n",no);
		for(int i=0;i<no;i++) {
			System.out.printf("%d. [ %s,%s ] \n",i,c[i].shape,n[c[i].number]);
		}
	}
	
	void shuffle() {
		int ranNum = 0;
		Card temp = null;
		for(int i=0;i<200;i++) {
			ranNum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ranNum];
			c[ranNum] = temp;
		}
	}
	
	void pick(int no) {
		System.out.println("  [ 카드출력 ]  ");
		System.out.printf("[ %s,%s ]",c[no].shape,n[c[no].number]);
	}
	
}
