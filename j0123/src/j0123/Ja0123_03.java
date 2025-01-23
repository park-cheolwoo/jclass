package j0123;

import java.util.Scanner;

public class Ja0123_03 {

	public static void main(String[] args) {
		try {
			// 정상적으로 돌아가는 프로그램 구현
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			throw new Exception("고의로 에러 발생");
//			System.out.println(4);
			
		}catch(Exception e) { // 파이썬 - try - except(Exception as e)
			// 에러가 났을 때 실행되는 부분
			System.out.println(e.getMessage());
			e.printStackTrace(); // 에러 위치, 에러 설명
			System.out.println("에러발생 3-1");
			System.out.println("에러발생 4-1");
		}
		System.out.println(5);
		System.out.println(6);

	}

}
