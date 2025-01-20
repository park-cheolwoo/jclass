package ja0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아 5개를 저장하고 5개의 값을 출력하고 합계를 출력
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		for (int i=0;i<score.length;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			System.out.printf("%d번째 숫자를 입력하세요.",i+1);
			score[i] = scan.nextInt();
			sum += score[i];
			System.out.println((i+1)+"번째 값 : "+score[i]);
		}

		System.out.println("합계 : "+sum);
	}

}
