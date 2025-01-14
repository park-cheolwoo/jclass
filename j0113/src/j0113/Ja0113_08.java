package j0113;

public class Ja0113_08 {

	public static void main(String[] args) {
		// 연산자
	 System.out.println(10/3.0);
	 // %d : 정수형, %f : 실수형, %S : 문자열, %c : 문자형
	 // 소숫점 자리수 표시
	 System.out.printf("%.3f \n", 10/3.0);
	 // 천단위 표시
	 System.out.printf("%,d \n", 100000000);
	 System.out.printf("나이 : %d, 생년 : %d \n", 14, 2017);
	 System.out.println("나이 : "+14 +", 생년 : "+2017+"년");
	 System.out.printf("%05d \n", 100); // 0으로 채워줌
	 System.out.printf("%5d \n",100); // 공백으로 채워줌
	 System.out.printf("%.5f \n",0.01F);
	 System.out.printf("%5f \n",0.01F);
	 
	 
	 
	 System.out.printf("%d \n", 0x1A); // 16*1 + 1*10 = 26
	 System.out.printf("%#X \n", 65); // 41
	}

}
