package j0114;

import java.util.Scanner;

public class Ja0114_05 {
	
	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 가장 큰 수를 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int num3 = scan.nextInt();
		int result = (num1>=num2 && num1>=num3)?num1:(num2>=num3? num2:num3);
		System.out.printf("result : "+result+"\n");
		int result2 = (num1 <=num2 && num1<=num3)?num1:((num2<=num3)?num2:num3);
		System.out.printf("result2 : "+result2);
		
		
		// 양수(0포함), 음수를 체크하는 함수
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		String result = (input>0)? "양수":((input==0)?"0":"음수");
//		System.out.printf("결과 : %s",result);
		
		
		//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		String result = score>=60? "합격":"불합격";
//		System.out.println("결과 : "+result);
		
			
		
		
		
		
		
		
//		System.out.println("숫자를 입력하세요.");
//		int x = scan.nextInt();
//		int absX = x>=0? x:-x;
//		System.out.println(absX);
//		
		
		
		
		
		
		
		
		
		
		
		// 올림-ceil,버림-floor,반올림-round
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("영문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		if((input>='a' && input<='z') ||(input >='A' && input <= 'Z') ) {
//			System.out.println("영문자 입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}
//				
				
//		if(5>3) {
//			System.out.println("정답");
//		}else {
//			System.out.println("오답");
//		}
		
		
		
		
		

//		Scanner scan = new Scanner(System.in);
//		System.out.println("소숫점 3자리 실수를 입력하세요.");
//		double input = scan.nextDouble();
//		
//		// 3자리에서 반올림해서 값을 출력하시오
//		double result = Math.round((input*100))/100.0;
//		System.out.println(result);
//		
//		System.out.println(Math.round(102.9820));
		
		
		
		// 버림
//		float pi = 3.141592f;
//		float pi2 = (int)(pi*1000)/1000.0F;
//		System.out.println(pi2);
//		float pi3 = (int)(pi*100000)/100000f;
//		System.out.println(pi3);
		
		// 반올림
//		double pi = 3.141592;
//		double pi2 = Math.round(pi*1000)/1000.0;
//		System.out.println(pi2);
//		
		
	}
}
