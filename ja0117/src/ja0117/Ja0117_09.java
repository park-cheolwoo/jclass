package ja0117;

import java.util.Scanner;

public class Ja0117_09 {

	//메소드
//	int add(int a,int b) {
//		int result = a+b;
//		return result;
//	}
//	
//	boolean power; // 인스턴트 변수 - 객체선언후 참조변수명.변수명
//	void power() {
//		power = !power;
//  }
	//메소드
	public static void main(String[] args) {
		// 메소드 3개
		// 2개의 값을 넘겨주면 -> a,b에 각각 10을 더해서 두 수를 더해서 리턴
		// a,b에 각각 10을 곱해서 두 수를 더해서 리턴
		// a,b에 a,b에 곱해서 리턴
		Scanner scan = new Scanner(System.in);
		Cal2 c = new Cal2();
		while(true) {
			
		System.out.println("첫번째 수를 입력하세요. >> ");
		int a = scan.nextInt();
		if(a==-1) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		System.out.println("두번째 수를 입력하세요. >> ");
		int b = scan.nextInt();
		int result1 = c.add1(a, b);
		int result2 = c.add2(a, b);
		int result3 = c.add3(a, b);
		System.out.println("첫번째 수 : "+a);
		System.out.println("두번째 수 : "+b);
		System.out.println("1번 메소드 : "+result1);
		System.out.println("2번 메소드 : "+result2);
		System.out.println("3번 메소드 : "+result3);
		}
		
		
		
		
//		Cal c = new Cal();
//		int num = 100;
//		int num2 = 20;
//		int result = c.add(num,num2);
//		System.out.println("더하기 : "+result);
//		int result2 = c.sub(num,num2);
//		System.out.println("빼기 : "+result2);
//		
//		int result3 = c.multi(num,num2); // 에러
		
		
//		int a = 0; // 지역변수
//		Ja0117_09 j = new Ja0117_09(); // 객체선언
//		j.power = true;
//		System.out.println(j.power);

	}
}


