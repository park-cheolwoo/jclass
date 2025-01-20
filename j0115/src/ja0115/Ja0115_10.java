package ja0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ja0115_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input2 = new String[6];
		String[] ball = new String[45];
		
		// 1~45까지
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1+"";}
		
		for(int j=0;j<6;j++) {			
		System.out.println("           [ 로또맞추기 ] ");
		for(int i=0;i<ball.length;i++) {
			if(i%5==0) {
				System.out.println();
			}
			System.out.print(ball[i]+"\t");
		}
		
		System.out.println();
		System.out.println("원하는 번호를 입력하세요. >> ");
		int input = scan.nextInt();
		ball[input-1]="X";
		input2[j]=input+"";
		
		// 입력한 번호 5 -> 5번자리 X
		// 5번 -> ball[5-1] = "X"
		}
		// 마지막에 input 없이 결과창 출력
		System.out.println("           [ 로또맞추기 ] ");
		for(int i=0;i<ball.length;i++) {
			if(i%5==0) {
				System.out.println();
			}
			System.out.print(ball[i]+"\t");
		}
		System.out.println();
		System.out.print("입력하신 숫자 : ");
		for(int i=0;i<6;i++) {
			System.out.print(input2[i]+" ");
		}
		
		// 입력번호 : 모두 출력되도록 하시오.
		
//		int[] num = {1,9,3,8,5,2,7,13,28,20};
//		Integer[] num2 = {11,9,13,28,5,20,7};
//		System.out.println(Arrays.toString(num));
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		Arrays.sort(num2,Collections.reverseOrder());
//		// 파이썬 : students.sort(key=lambda x: x["name"], reverse=True)
//		System.out.println(Arrays.toString(num2));
	}

}
