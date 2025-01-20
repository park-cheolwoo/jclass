package ja0120;

import java.util.Scanner;

public class Ja0120_11 {

	public static void main(String[] args) {
		// 학생성적입력,츨력,수정 , 배열X 객체O
		Stuscore[] s = new Stuscore[10];
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		int total=0,rank=0;
		double avg=0;
		String name="";
		int choice=0,temp=0,count=0,rankC=0,i=0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		loop:while(true) {
			System.out.println(" [ 학생성적프로그램 ] ");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 프로그램종료");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println();
				System.out.println(" [ 학생성적입력 ] ");
				while(i<s.length) {				
				System.out.printf("%d번째 학생 이름을 입력하세요.(0. 이전으로) \n",count+1);
				name = scan.next();
				if(name.equals("0")) {break;}
				for(int j=0;j<score.length;j++) {
					System.out.printf("%s 점수를 입력하세요. \n",title[j+2]);
					score[j] = scan.nextInt();
				}
				s[count] = new Stuscore(name,score[0],score[1],score[2]);
				s[count].print();
				System.out.printf("%d번째 학생 성적이 저장되었습니다. \n",s[count].no);
				i++;
				count++;
				}
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.println(" [학생성적출력] ");
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s\t",title[j]);
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------------");
				for(int j=0;j<count;j++) {
					System.out.printf("%d\t",s[j].no);
					System.out.printf("%s\t",s[j].name);
					System.out.printf("%d\t",s[j].kor);
					System.out.printf("%d\t",s[j].eng);
					System.out.printf("%d\t",s[j].math);
					System.out.printf("%d\t",s[j].total);
					System.out.printf("%.2f\t",s[j].avg);
					System.out.printf("%d\n",s[j].rank);
				}
				System.out.println();
				break;
			case 3:
				System.out.println();
				System.out.println(" [ 학생성적수정 ] ");
				temp = 0;
				System.out.println("찾고자하는 학생 이름을 입력하세요.(0. 이전으로)");
				name = scan.next();
				if(name.equals("0")) {break;}
				for(int j=0;j<count;j++) {
					if(s[j].name.equals(name)) {
						temp = 1;
						System.out.printf("%s 학생을 찾았습니다. \n",s[j].name);
						for(int k=0;k<score.length;k++) {
							System.out.printf("%d. %s 성적 수정 \n",k+1,title[k+2]);
						}
						System.out.println("------------------------------------------------");
						System.out.println("원하는 번호를 입력하세요. >> ");
						choice = scan.nextInt();
						switch(choice) {
						case 1:
							System.out.println(" [국어 성적 수정] ");
							System.out.printf("현재 국어 성적 : %d \n",s[j].kor);
							System.out.printf("수정할 국어 성적을 입력하세요.");
							s[j].kor = scan.nextInt();
							break;
						case 2:
							System.out.println(" [영어 성적 수정] ");
							System.out.printf("현재 영어 성적 : %d \n",s[j].eng);
							System.out.printf("수정할 영어 성적을 입력하세요.");
							s[j].eng = scan.nextInt();
							break;
						case 3:
							System.out.println(" [수학 성적 수정] ");
							System.out.printf("현재 수학 성적 : %d \n",s[j].math);
							System.out.printf("수정할 수학 성적을 입력하세요.");
							s[j].math = scan.nextInt();
						}
							s[j].total = s[j].kor+s[j].eng+s[j].math;
							s[j].avg = s[j].total/3.0;
							System.out.printf("%s 학생 성적이 수정되었습니다. \n",s[j].name);
					}
				}
				if(temp==0) {
					System.out.printf("%s 학생을 찾지 못했습니다. \n",name);
				}
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println(" [ 등수처리 ] ");
				for(int j=0;j<count;j++) {
					rankC = 1;
					for(int k=0;k<count;k++) {
					if(s[j].total < s[k].total) {
						rankC += 1;
					}
					}
					s[j].rank = rankC;
				}
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
			default:
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				break loop;
		}
		
		
		
		

	}

	}
}
