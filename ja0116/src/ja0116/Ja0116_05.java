package ja0116;

import java.util.Scanner;

public class Ja0116_05 {

	public static void main(String[] args) {
		// 번호, 이름, 국어, 영어, 수학, 합계, 평균
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int choice = 0;
		
		//화면구현
		loop: while(true) {			
		System.out.println("  [ 학생성적프로그램 ]  ");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("0. 종료");
		System.out.println("------------------------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		
		
		
		switch (choice) {
		case 1: {
			System.out.println(" [ 학생성적입력 ] ");
			int i=0;
			int total = 0;
			while(i<10) {
				System.out.printf("[ %d 번째 ]\n",count+1);
				// 번호
				no[i] = count+1;
				System.out.println("이름을 입력하세요. ");
				// 이름
				String nme = scan.next();
				if(nme.equals("0")) {
					System.out.println("입력을 종료합니다.");
					break;}
				name[i] = nme;
				for(int j=0;j<3;j++) {
					System.out.printf("%s 점수를 입력하세요.",title[j+2]);
					// 국어, 영어, 수학
					score[i][j]=scan.nextInt();
					total += score[i][j];
				}
				// 합계
				score[i][3]= total;
				// 평균
				avg[i] = total/3.0;
				System.out.printf("%d 번 학생이 저장되었습니다. \n",count+1);
				i++;
				count++;
				}
			}
			break;
		case 2:{
			System.out.println(" [ 학생성적출력 ] ");
			System.out.println("-----------------------------------------------------");
			for(int j=0;j<title.length;j++) {
				System.out.printf("%s\t",title[j]);
			}
			System.out.println();
			System.out.println("-----------------------------------------------------");
			for(int j=0;j<count;j++) {
				System.out.printf("%d\t",no[j]);
				System.out.printf("%s\t",name[j]);
				for(int k=0;k<score[j].length;k++) {
					System.out.printf("%d\t",score[j][k]);
				}
				System.out.printf("%.2f\n",avg[j]);
//				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",no[j],name[j],score[j][0],score[j][1],score[j][2],score[j][3],avg[j]);
				}
			}
			break;
		default:
			System.out.println("프로그램을 종료합니다.");
			break loop;
		}		
	}// while true
		
		

		
	}//main

}//class
