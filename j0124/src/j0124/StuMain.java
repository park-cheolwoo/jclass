package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuDeck stuDeck = new StuDeck();
		int choice;
		// 파일 읽어오기
		stuDeck.fileRead();
//		stuDeck.listPrint();
		loop:while(true) {
			System.out.println("----------------------------");
			System.out.println(" [ 학생성적프로그램 ] ");
			System.out.println("----------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 학생성적검색");
			System.out.println("6. 학생등수정렬");
			System.out.println("7. 학생이름정렬");
			System.out.println("8. 등수처리");
			System.out.println("9. 파일저장");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				stuDeck.input();
			case 2: //학생성적출력
				stuDeck.listPrint();
				break;
			case 3:
				stuDeck.modify();
				break;
			case 4: //학생성적삭제
				stuDeck.delete();
				break;
			case 5:
				stuDeck.search();
				break;
			case 6:
				stuDeck.orderRank();
				break;
			case 7:
				stuDeck.orderName();
				break;
			case 8:
				stuDeck.rank();
				break;
			case 9:
				stuDeck.save();
				break;
			case 0:
				System.out.println(" [ 프로그램종료 ] ");
				break loop;
			}
		}
		
	}
		
}
