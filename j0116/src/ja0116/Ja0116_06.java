package ja0116;

import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class Ja0116_06 {

	public static void main(String[] args) {
		// 1. 변수선언
		Scanner scan = new Scanner(System.in);
		int[] no = new int[10];
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		int[] rank = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String nme = "";
		int total = 0;
		int count = 0;
		int choice = 0;
		int i=0;
		int j=0;
		String search = "";
		int temp = 0;
		// 2. 화면구현
		loop: while(true) {
		System.out.println(" [ 학생성적프로그램 ] ");
		System.out.println("-----------------------------------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 등수처리");
		System.out.println("0. 종료");
		System.out.println("");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		// 3. 번호선택 switch
		switch (choice) {
		// 4. 학생성적입력
		case 1: {
			System.out.println(" [ 학생성적입력 ] ");
			i=0; // 초기화
			while(i<10) {
				total = 0; // 합계 초기화
				System.out.printf("%d번째 학생 이름을 입력하세요.",i+1);
				nme = scan.next();
				if(nme.equals("0")) {
					System.out.println("프로그램 종료");
					break;
				}
				no[i] = i+1;
				name[i] = nme;
				for(j=0;j<3;j++) {
					System.out.printf("%s 성적을 입력하세요.",title[j+2]);
					score[i][j]=scan.nextInt();
					total += score[i][j];
				}
				score[i][3] = total;
				avg[i] = total/3.0;
				System.out.printf("%d번째 학생 성적이 입력되었습니다. \n",(i+1));
				i++;
				count++;
			}			
			}
			break;
		// 5. 학생성적출력
		case 2: {
			System.out.println(" [ 학생성적출력 ] ");
			for(i=0;i<title.length;i++) {
				System.out.printf("%s\t",title[i]);
			}
			System.out.print("\n");
			System.out.println("---------------------------------------------------------");
			for(i=0;i<count;i++) {
				System.out.printf("%d\t",no[i]);
				System.out.printf("%s\t",name[i]);
				for(j=0;j<score[i].length;j++) {
					System.out.printf("%d\t",score[i][j]);					
				}
				System.out.printf("%.2f\t",avg[i]);
				System.out.printf("%d\n",rank[i]);
			}
			break;
		}
		// 6. 학생성적수정
		case 3:{
			System.out.println(" [ 학생성적수정 ] ");
			System.out.println("수정할 학생의 이름을 입력하세요. >> ");
			nme = scan.next();
			for(i=0;i<name.length;i++) {
				temp=0;// 초기화
				if(nme.equals(name[i])) {
					temp=1;
					System.out.printf("%s 이름을 찾았습니다. \n",nme);
					for(j=0;j<score[i].length-1;j++) {
						System.out.printf("%d. %s 성적 수정 \n",(j+1),title[j+2]);
					}
					System.out.println("0. 이전으로");
					System.out.println("원하시는 번호를 입력하세요. >> ");
					choice = scan.nextInt();
					
					
					switch (choice) {
					case 1,2,3:
						System.out.printf("현재 %s 점수 : %d \n",title[choice+1],score[i][choice-1]);
						System.out.println("수정할 점수를 입력하세요. >> ");
						score[i][choice-1] = scan.nextInt();
						System.out.printf("%s 학생 성적이 수정되었습니다. \n",name[i]);
						score[i][3] = score[i][1]+score[i][2]+score[i][2];
						avg[i] = score[i][3]/3.0;
						break;
					default:
						System.out.println("이전으로 이동합니다.");
						break;
					}
				}
				if(temp==0) {
					System.out.printf("%s 학생을 찾지 못했습니다.",nme);
				}
			}
			break;
		}
		// 7. 등수처리
		case 4:
			System.out.println(" [ 등수처리 ] ");
			for(i=0;i<avg.length;i++) {
				temp = 1; // 1등에서부터 스타트
				for(j=0;j<avg.length;j++) {
					if(avg[i]<avg[j]) {
						temp++;
					}
				}
				rank[i] = temp;
			}
			System.out.println("등수처리가 완료되었습니다.");
			break;
		// 8. 종료
		default:
			System.out.println("프로그램을 종료합니다.");
			break loop;
		}
		
		
		
		
		
		
		
		}//while true
	}

}
