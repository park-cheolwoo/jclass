package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char ch = 'A';
	System.out.println(ch);
	
	char ch2 = '\u0041'; // 16*4+1*1=65
	System.out.println(ch2);
	
	char ch3 = 97; // 97 - a
	System.out.println(ch3);
	
	
	// print : 줄바꿈 X, println : 줄바꿈 O
	char ch4 = '\t';
	System.out.print(ch4);
	
	char ch5 = 'a';
	System.out.println(ch5);
	
	
	// true와 false는 모두 소문자로 작성 // python은 True로 대문자로 써야함
	// char - ''표시, 아스키코드값 : 65-'A', 97-'a', 48-'0'
	// 정수형 - byte,short : 거의 사용 안함, int :  값을 입력(기본형)
	// 정수형 - long : 접미사 L을 붙여야함
	// 실수형 - float : 접미사 F를 입력, double : 값을 입력(기본형)
	
	boolean p = true;
	boolean p2 = false;
	
	// int의 범위(21억)를 넘는 숫자는 뒤에 'l'또는'L'을 붙여야함
	// long은 모두 L을 붙여주는 것이 좋음
	long l = 10000000000L;
	
	// float은 뒤에 'F'를 붙여줘야함
	float f = 3.14F;
	float f2 = 100F; // 출력시 100.0으로 나옴
	// double은 붙여주지 않아도 됨(실수형의 기본형이므로), 원래는 'D'를 붙여줘야함
	double d = 3.14;
	}
	
	
	
}
