package ja0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 로또 맞히기
		// 1-45까지 로또번호 6개와
		// 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.
		
		// 1. 변수선언
			Scanner scan = new Scanner(System.in);
			int [] num = new int[45];
			int [] lotto = new int[6];
			int [] input = new int[6];
			int [] ans = new int[6];
			String [] balls = new String[45];
			int cnt = 0;
			int temp = 0;
		// 2. 1~45 번호저장
			for(int i=0;i<45;i++) {
				num[i] = (i+1);
			}
			
		// 3. 배열섞기
			for(int i=0;i<300;i++) {
				int ranNum = (int)(Math.random()*45);
				temp = num[0];
				num[0] = num[ranNum];
				num[ranNum] = temp;
			}
		
		// 4. 6개 로또번호 
			for(int i=0;i<6;i++) {
				lotto[i] = num[i];
			}
			System.out.println("로또번호 : "+Arrays.toString(lotto));
			System.out.println("전체 : "+Arrays.toString(num));
			for(int i=0; i<45; i++){
				balls[i] = (i+1)+"";
			}
			
		// 5. 입력창 만들기
			
			
			for(int k=0;k<input.length;k++) {
			System.out.println("           [ 로또 뽑기 ] ");
			for(int i=0;i<9;i++) {
				System.out.println();
				for(int j=0;j<5;j++) {
					System.out.print(balls[(5*i)+j]+"\t");
				}
			}
			System.out.println();
			
		// 6. 맞힌번호 확인
				System.out.println((k+1)+"번째 숫자를 입력하세요.");
				input[k] = scan.nextInt();
				for(int j=0;j<lotto.length;j++) {
					if(input[k] == lotto[j]) {
						ans[cnt] = input[k];
						cnt += 1;
						break;
					}
				balls[input[k]-1] = "X";
				}
			}
			
			
			
			
			
			
			
		// 7. 출력
			System.out.println(" [ 로또 확인 ] ");
			System.out.println("로또 번호 : "+Arrays.toString(lotto));
			System.out.println("입력 번호 : "+Arrays.toString(input));
			System.out.println("맞힌 개수 : "+cnt);
			System.out.print("맞힌 번호 : ");
			for(int i=0;i<cnt;i++) {
				System.out.print(ans[i]+" ");
			}
			
		// [ 로또 확인 ]
		// 로또번호 : 1 4 10 26 45 34
		// 입력번호 : 5 7 10 9 34 44
		// 맞춘개수 : 2
		// 맞춘번호 : 10 34
	}

}
