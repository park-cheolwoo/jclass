package j0120;

import java.util.Scanner;

public class Cal4 {
	void input(String[] name,int[] kor) {
		// 이름, 국어점수 3개를 입력
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			System.out.println("국어 점수를 입력하세요.");
			kor[i] = scan.nextInt();
		} 
	}
	
}
