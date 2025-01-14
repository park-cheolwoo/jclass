package j0113;

public class Ja0113_04 {

	public static void main(String[] args) {
		// 문자 - g 입력해서 출력
		// 문자열 - 안녕하세요. 입력해서 출력
		// 숫자 - 10000 입력해서 출력(int)
		
		// char은 작은 따옴표, String은 큰 따옴표
		
		
		char ch1 = 'g';
		System.out.println(ch1);
		
		String str2 = "안녕하세요.";
		System.out.println(str2);
		
		int num1 = 10000;
		System.out.println(num1);
		
		
		// java는 true로 써야함, True는 다르게 인식함
		// 예약어 불가, 숫자 첫글자 불가, 특수문자 불가(_와 $는 가능 / _만 사용)
		
		// 스네이크 케이스
		int last_index_of = 10;
		// 캐멀 케이스
		int lastIndexOf = 10;
		
		// final : 상수(값을 변경할 수 없음) >> 상수는 대문자로 작성
		final int PI = 3;
        //PI = 10; >> 상수 값 변경 불가능
		
	}

}
