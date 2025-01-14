package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// for - 반복횟수
		// while - 조건
		
		
		
		// while 구구단 출력
		int i = 2;
		int j = 1;
		while(i<=9) {
			j = 1; // 초기화
			System.out.println("[ "+i+" 단 ]");
			while(j<=9) {
				System.out.printf("%d * %d = %d \t",i,j,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
		
		
		
//		int i=1;
//		while(i<=5) {
//			System.out.println("안녕"+i);
//			i++;
//		}
//		for(int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//		}
//		
		
		
		
		
		
		
		
		// 입력받은 숫자부터 9단까지 구구단을 출력
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자1을 입력하세요");
//		int num1 = scan.nextInt();
//		System.out.println("숫자2를 입력하세요");
//		int num2 = scan.nextInt();
//		if(num1>num2) {	
//			int a = num1; num1=num2; num2=a;
//		}			
//		
//		int min = Math.min(num1,num2);
//		int max = Math.max(num1, num2); 
//		
//		
//		
//		for(int i=num1;i<=num2;i++) {
//			System.out.printf("[%d 단] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//				}
//			System.out.println();
//			}


		//구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[%d 단] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		
		
		
		// 무한반복
//		Scanner scan = new Scanner(System.in);
//		for(int i=0;;i++)
//		{System.out.println("안녕"+i);}
		
		
		
		
		
		
		
		
//		System.out.println("글자를 입력하세요.");
//		
//		// 모두 영문자일 때 1개씩 출력
//		String str = scan.nextLine();
//		int cnt = 0;
//		for(int i=0;i<str.length();i++) {
//			if(!(str.charAt(i)>='a' && str.charAt(i)<='z') || !(str.charAt(i)>='A' && str.charAt(i)<='Z'))
//			{cnt = 1; break;}
//		}	
//		System.out.println(cnt);
//		if(cnt == 0) {System.out.println(str);}
//		else {System.out.println("영문자가 아닌 글자가 있습니다.");}
//		
		
		
		
		
		
		
		// 입력받은 글자를 1개씩 출력하는 프로그램을 구현하시오.
//		String str = scan.nextLine();
//		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
//		}
//		
		
		
		
//		String input = "abcdefghijk";
//		// 단어를 1개씩 출력
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
		
		
//		System.out.println(input.length());
//		System.out.println(input.charAt(4));
//		System.out.println(input.charAt(input.length()-1));
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("글자를 입력하세요.(영문자만 입력 가능) : ");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch<='Z')) {
//			System.out.println("출력 : "+ch);
//		}else {System.out.println("영문자가 아닙니다. 다시 입력하세요.");}
		
		
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			sum += i;
//			System.out.println(i);
//		}
//	System.out.println(sum);

	}

}
