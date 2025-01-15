package ja0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_03 {

	public static void main(String[] args) {
		// 1~5까지의 랜덤 숫자를 생성해서
		// 5번 입력받아 랜덤 숫자를 몇번 맞췄는지 횟수를 출력하시오.
		// 입력했던 숫자도 모두 출력하시오.
		
		// 정답횟수 : 1번
		// 입력숫자 : 1,2,3,4,5
		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random()*5+1);
		int ans[] = new int[5];
		int score = 0;
		for(int i=0;i<ans.length;i++) {
			System.out.println((i+1)+"번째 시도입니다. 숫자를 입력해주세요.");
			ans[i] = scan.nextInt();
			if(ans[i]==rnum) {
				score += 1;
			}
		}
		System.out.println("5번 시도하셨습니다. 정답은 "+rnum+" 입니다.");
		System.out.println("정답을 맞춘 횟수 : "+score+" 회");
		System.out.println("입력하신 숫자 : "+ans[0]+", "+ans[1]+", "+ans[2]+", "+ans[3]+", "+ans[4]);
		System.out.println("입력숫자 : "+Arrays.toString(ans));
		
	}

}
