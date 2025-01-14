package j0114;

import java.util.Scanner;

public class Ja0114_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("소문자를 입력하세요.");
		char str = scan.next().charAt(0);
		// 대문자로 출력
		char str2 = (char)(str-32);
		System.out.println(str2);
		
		
		
//		char c1 = 'a';
//		char c2 = (char)(c1-32);
//		System.out.println(c2);
//		
//		char c3 = 'A';
//		char c4 = (char)(c3+32);
//		System.out.println(c4);
		
//		int n1 = c1+1;
//		System.out.println(n1);
//		
//		char c3 = ++c1;
//		System.out.println(c3);
//		
//		int n2 = 'B' - 'A';
//		System.out.println(n2);
//		
//		int n3 = '9' - '0';
//		System.out.println(n3);
//		
//		int n4 = '2' - '0';
//		System.out.println(n4);
//		
		
//		int a = 10;
//		a++; // 증감연산자 먼저 실행 후 대입하는 것이 좋음
//		int b = a;
//		System.out.println("a : "+a); // a=11
//		System.out.println("b : "+b); // b=10
		
		// byte,short,char 사칙연산을 하면 int 로 타입이 변경됨
//		byte a = 1;
//		byte b = 2;
//		byte c = (byte)(a+b); // 사칙연산 후 형변환을 해야함
//		byte d = (byte)a + (byte)b;
//		
//		char ch = 'a'; // 97 A:65 0:48
//		char ch2 = 'b'; // 98
//		int ch3 = ch+ch2;
//		System.out.println(ch3);
//		
//		double d1 = 3.14;
//		int num = (int)d1;
//		System.out.println(num);
		
//		int a = 1000000;
//		int b = 2000000;
//		long c = a*b;
//		System.out.println(c); // overflow : -1454759936
//		
//		int n1 = 2100000000;
//		int n2 = 2000000000;
//		long c2 = (long)n1+n2;
//		System.out.println(c2); //overflow : -194967296
	}

}
