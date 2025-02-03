package j0127;

import java.util.Scanner;

public class Ja0127_01 {

	public static void main(String[] args) {
		// 1. ball 객체
		int[] ball = new int[45];
		int[] input = new int[6];
		int[] ans = new int[6];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		for(int i=0;i<45;i++) {
			System.out.printf(ball[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		for (int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45);
			int temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		for(int i=0;i<45;i++) {
			System.out.printf(ball[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------------------");
		int j=0;
		while(j<6) {
			System.out.println("1~45 사이의 숫자를 입력하세요. >> ");
			input[j] = scan.nextInt();
			for(int i=0;i<6;i++) {
				if(input[j]==ball[i]) {
					ans[count]=input[j];
					count++;
					break;
				}
			}
			j++;
		}
		System.out.printf("로또 번호 : %d,%d,%d,%d,%d,%d \n",ball[0],ball[1],ball[2],ball[3],ball[4],ball[5]);
		System.out.printf("입력한 숫자 : %d,%d,%d,%d,%d,%d \n",input[0],input[1],input[2],input[3],input[4],input[5]);
		System.out.printf("맞힌 횟수 : %d회 \n",count);
		System.out.print("맞힌 숫자 : ");
		for(int i=0;i<count;i++) {
			System.out.printf("%d ",ans[i]);
		}
		
		
		// 2. ball_deck 객체
		// 3. main에서 로또프로그램을 실행해서 6개 숫자 입력, 로또번호와 비교해서 몇개를 맞췄는지 확인
	}

}
