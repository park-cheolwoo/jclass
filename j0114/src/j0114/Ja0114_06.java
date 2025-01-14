package j0114;

import java.util.Scanner;

public class Ja0114_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//조건문 : if, switch
		// 1 -- 입력창, 2--검색창, 3--수정창 4--삭제창 5--종료
//		System.out.println("원하는 번호를 입력하세요.");
//		int num = scan.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("입력창이 나옵니다.");
//			break;
//		case 2:
//			System.out.println("검색창이 나옵니다.");
//			break;
//		case 3:
//			System.out.println("수정창이 나옵니다.");
//			break;
//		case 4:
//			System.out.println("삭제창이 나옵니다.");
//			break;
//		default:
//			System.out.println("프로그램이 종료됩니다.");
//			break;
//		}
		System.out.println("사용자 권한을 생성합니다.");
		int num = scan.nextInt();
		switch(num) {
		case 5:
			System.out.println("슈퍼바이저 권한이 부여됩니다.");
		case 4:
			System.out.println("삭제 권한이 부여됩니다.");
		case 3:
			System.out.println("수정 권한이 부여됩니다.");
		case 2:
			System.out.println("작성 권한이 부여됩니다.");
		case 1:
			System.out.println("읽을 권한이 부여됩니다.");
			break;
		}
		
		
		
		
		
		
		
		
		
		// 점수를 입력받아 A-90 B-80 C-70 D-60 F-60 이하 학점 출력
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
		
		
		
		
//		if(score>=90) {System.out.print("result : A");}
//		else if(score>=80) {System.out.print("result : B");}
//		else if(score>=70) {System.out.print("result : C");}
//		else if(score>=60) {System.out.print("result : D");}
//		else {System.out.print("result : F");}
//		System.out.println("학점");
		
		
		
		
		
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		if(num >0) {
//			System.out.println("양수입니다.");
//		}else if(num ==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}

	}

}
