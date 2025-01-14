package j0113;

public class Ja0113_06 {

	public static void main(String[] args) {
		char ch = 'a';
		System.out.println(ch);
		
		// 아스키코드
		char ch2 = 65;
		System.out.println(ch2);
		
		int ch3 = 65;
		System.out.println(ch3);
		
		String ch4 = "AB";
		System.out.println(ch4);
		
		String num = "3.14";
		System.out.println(num);
		
		String s1 = "A"+"B";
		System.out.println(s1); //String 타입
		
		System.out.println(""+7); //String 타입
		System.out.println(""+7+7);//String 타입 77
		System.out.println(7+7+""+7);//String타입 147
		
		
//		char ch5 = ''; // '' 사이에 아무것도 없는 것은 에러
		char ch5 = ' '; // 공백은 가능
		
		int n1 = 2147483647; // int의 최대값 : 2147483647 / 최소값 : -2147483648
//		int n2 = 2147483648;
		int n3 = n1+1;
		System.out.println(n3); // -2147483648 >> 정수의 overflow
		System.out.println(n3+1); // -2147483647
	}

}
