package ja0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_03 {

	public static void main(String[] args) {
		// 5,5 배열을 생성
		Scanner scan = new Scanner(System.in);
		String[][] arr = new String[5][5];
		String[][] arr2= new String[5][5];
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int temp=0;
		
		
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*25);
			temp = num[0];
			num[0]=num[ranNum];
			num[ranNum]=temp;
		}
		// System.out.println(Arrays.toString(num)); // 1차원번호 배열
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = num[(5*i)+j]+"";
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = "뽑기";
			}
		}
		
		//뽑기출력
		int no = 0;
		int cnt = 0;
		int money = 0;
		int x=0;
		int y=0;
		System.err.printf("당신의 머니 : %s \n",money);
		loop: while(no<10) {
		no++;
		System.out.println("               [ 뽑기 게임 ]   ");
		System.out.println("-------------------------------------------");
		System.out.print("좌표 |\t0\t1\t2\t3\t4\n");
		System.out.println("-------------------------------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d   | \t",i);
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%s\t",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
		
		// 좌표입력
		while(true) {
			
		System.out.print("(행) X좌표를 입력하세요.(종료 : -1) >> ");
		x = scan.nextInt();
		if(x==-1) {
			System.out.println("프로그램을 종료합니다.");
			break loop;
		}
		System.out.print("(열) Y좌표를 입력하세요. >> ");
		y = scan.nextInt();
		
		if((x>=0 && x<=4) && (y>=0 && y<=4)) {break;}
		else {System.out.println("좌표를 잘못 입력하셨습니다. 다시 입력하세요.");}
		}
		
		System.out.printf("입력한 좌표 : [%d,%d]\n",x,y);
		if(arr2[x][y].equals("0")) {
			arr[x][y] = "꽝!";
		}else if(arr2[x][y].equals("1")) {
			arr[x][y] = "당첨";
		switch(cnt) {
		case 0:
			money += 100000000;
			cnt ++;
			break;
		case 1:
			money += 100000000;
			cnt++;
			break;
		case 2:
			money += 200000000;
			cnt++;
			break;
		case 3:
			money += 400000000;
			cnt++;
			break;
		case 4:
			money += 800000000;
			cnt++;
		}
		}
		System.out.printf("결과 : %s \n",arr[x][y]);
		System.out.printf("당신의 머니 : %,d \n",money );
//		System.out.printf("결과 : %s \n",arr2[x][y]);
		}
		
		//번호출력
//		System.out.println("    [ 뽑기 게임 ]   ");
//		System.out.println("-------------------------------------------");
//		System.out.print("좌표 |\t0\t1\t2\t3\t4\n");
//		System.out.println("-------------------------------------------");
//		for(int i=0;i<arr2.length;i++) {
//			System.out.printf("%d   | \t",i);
//			for(int j=0;j<arr2[i].length;j++) {
//				System.out.printf("%s\t",arr2[i][j]);
//			}
//			System.out.println();
//		}
	}

}
