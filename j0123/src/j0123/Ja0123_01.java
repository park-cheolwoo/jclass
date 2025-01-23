package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Ja0123_01 {
	
	public static void main(String[] args) {
		
		// 학생성적프로그램
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		Stu_Deck sd = new Stu_Deck();
		
		//무한반복
		loop:while(true) {
			//화면구현
			choice = sd.main_print();
			switch (choice) {
			case 1:
				sd.input();
				break;
			case 2:
				sd.output();
				break;
			case 3:
				sd.modify();
				break;
			case 4:	
				sd.rank();
				break;
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
			
		}//while loop
	}
}