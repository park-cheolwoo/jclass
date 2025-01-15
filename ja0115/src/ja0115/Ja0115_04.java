package ja0115;

import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1~100 랜덤숫자를 생성
		// 10번 도전해서 정답을 맞추면 종료
		// 랜덤숫자보다 큰 수, 작은 수
		// 입력한 숫자를 모두 출력
		
		// 랜덤숫자 : 55
		// 입력한 숫자 : 1,2,3,4,55
		// 도전 : 5
		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random()*100+1);
		int flag = 0;
		int cnt = 0;
		int[] ans = new int[10];
		System.out.println("치팅용 정답 : "+rnum);
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"번째 도전입니다. 숫자를 입력하세요");
			ans[i] = scan.nextInt();
			if(ans[i]==rnum) {
				System.out.println("정답입니다! 정답은 "+rnum+"입니다.");
				flag = 1;
				cnt += 1;
				break;
			}
			else if(ans[i]<rnum) {
				System.out.println("입력하신 숫자는 정답보다 작습니다. 더 큰 수를 입력해주세요.");
				cnt += 1;
			}else {
				System.out.println("입력하신 숫자는 정답보다 큽니다. 더 작은 수를 입력해주세요.");
				cnt +=1;
			}
		}
		if(flag==0) {
			System.out.println("10번 도전에 모두 실패하셨습니다. 정답은 "+rnum+"입니다.");
		}
		System.out.println("도전 횟수 : "+cnt);
		System.out.print("입력하신 숫자 : ");
		for(int i=0;i<cnt;i++) {
			if(i!=cnt-1) {
				System.out.print(ans[i]+", ");
			} else {
				System.out.print(ans[i]);
			}
		}
		

	}

}
