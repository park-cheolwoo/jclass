package j0113;

public class Ja01113_07 {

	public static void main(String[] args) {
		// 형변환

		int n1 = 65;
		char ch1 = (char)n1; //int 타입이 더 높름 //int->char 강제 형변환
		System.out.println(n1);
		System.out.println(ch1);
		
		char ch2 = 'a';
		int n2 = ch2;
		System.out.println(n2); // a의 아스키코드 값인 97이 출력됨

		float f1 = 3.14F;
		int n3 = (int)f1;
		System.out.println(n3); // 소수점 버림
		
		int n4=10;
		float f2=n4;
		System.out.println(f2);
	}

}
