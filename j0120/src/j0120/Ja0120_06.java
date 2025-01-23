package j0120;

public class Ja0120_06 {

//	Ja0120_06(){} // 기본생성자
	
	static int bb=0;
	int aa=0;
	public static void main(String[] args) {
		int total = 1;
		for(int i=1;i<=5;i++) {
			total *= i;
		}
		System.out.println(total);
//		System.out.println(aa);
		System.out.println(fac(5));
		System.out.println(bb);
		int k = 0;
		double m = 0;
		float n = 0;
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
	}
	
	static long fac(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			result = n * fac(n-1);
		}
		return result;
	}
	
//	static long fac(double n) {
//		
//	}
//	
//	static long fac(long a, long b) {
//		
//	}
	
	// 오버로딩 - 1. 이름이 같아야함 2. 매개변수 타입 또는 개수가 달라야함 3. 리턴 타입은 오버로딩의 성립조건이 아님
	// 변수 종류 - 1. 클래스 변수 : 객체선언 없이 클래스명.변수명 2. 인스턴스 변수 : 객체선언후 참조변수명.변수명 3. 지역변수
	// 메소드 종류 - 1. 클래스 메소드 : 객체선언 없이 메소드명 2. 인스턴스 변수 : 객체선언후 참조변수명.메소드명
}
