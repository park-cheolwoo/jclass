package j0114;

import java.util.Scanner;

public class Ja0114_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//break : 반복문을 중지
		//continue : 반복문을 1회만 중지
		
		
		
		for(int i=2;i<=9;i++) {
			if(i%2==0) {continue;}
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			System.out.println();
		}
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		String str = "홍길동";
//		System.out.println("이름을 입력하세요. >>");
//		String input = scan.next();
//		if(str.equals(input)) {
//			System.out.println("홍길동이 맞습니다.");
//		}else {
//			System.out.println("홍길동이 아닙니다.");
//		}

		
		
		
		
		// 기본형 : boolean,char,byte,short,int,long,float,double
		
//		String str = "안녕하세요.";
//		String str2 = "안녕.";
//		String str3 = "안녕하세요.";
//		String str4 = new String("안녕하세요.");
//		
//		if(str==str3) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		System.out.println("------------------");
//		if(str==str4) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		System.out.println("------------------");
//		if(str3==str4) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		System.out.println("------------------");
//		if(str.equals(str3)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		System.out.println("------------------");
//		if(str.equals(str4)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		System.out.println("------------------");
//		if(str3.equals(str4)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		// 8가지 기본형 타입 이외 비교 : .equals()
		
		
		
//		int num = 10;
//		int num2 = 10;
//		if(num == num2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		
		// 1~100의 랜덤숫자를 입력받아, 10번을 입력해서 숫자 맞추기 게임을 구현
		// 10번 이후에는 정답 공개
//		Scanner scan = new Scanner(System.in);
//		int rnum = (int)(Math.random()*100+1);
//		System.out.println(rnum);
//		int flag = 0;
//		for (int i=1;i<=10;i++) {
//			System.out.println(i+"번째 도전입니다.");
//			System.out.println("1~100 사이의 정답을 입력하세요.");
//			int answer = scan.nextInt();
//			if(rnum==answer) {
//				System.out.println("정답입니다!");
//				flag = 1;
//				break;
//			}else if(rnum<answer) {
//				System.out.println("정답은 입력하신 숫자보다 작습니다.");
//			}else if(rnum>answer) {
//				System.out.println("정답은 입력하신 숫자보다 큽니다.");
//			}
//		}
//			System.out.println("정답은 "+rnum+" 입니다.");			

		
		
		
		
		
		
		// 1-100(중복O)
//		for(int i=0;i<20;i++) {		
//			int ran = (int)(Math.random()*100+1);
//			System.out.println(ran);
//		}
		
		
		
		
		
		
//		double num = Math.random()*10;
//		System.out.println(num);
		
		// 반복문을 사용해서
		// 000 ~ 999 까지 출력하시오.
		// 000,001,002,003,004,....,010,011,....,999
		
		
//		for(int i=0;i<=999;i++) {
//			System.out.printf("%03d \n",i);
//			}
//		
//		System.out.println("---------------------------------------------");
//		
//		int j = 1;
//		while(j<=999) {
//			System.out.printf("%03d \n",j);
//			j++;
//			}
//		
	
	}
}
