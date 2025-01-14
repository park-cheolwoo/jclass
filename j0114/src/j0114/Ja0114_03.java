package j0114;

import java.util.Scanner;

public class Ja0114_03 {

	public static void main(String[] args) {
		// 학생성적프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 이름을 입력하세요. ");
		String name = scan.nextLine();
		System.out.println("국어 점수를 입력하세요.");
		int kor = scan.nextInt();
		
		// 영어,수학,합계까지 출력
		System.out.println("영어 점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학어 점수를 입력하세요.");
		int math = scan.nextInt();
		int sum = kor+eng+math;
		double avg = sum/3.0; // 정수/정수 = 정수이므로 3이 아니라 3.0으로 나눠야함
		
		System.out.printf("이름 : %s, 국어 : %d, 수학 : %d, 영어 : %d, 합계 : %d, 평균 : %.2f \n",name,kor,eng,math,sum,avg);
		
	}

}
