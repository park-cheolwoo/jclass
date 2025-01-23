package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	// 변수선언 - 번호,이름,국어,영어,수학,합계,평균
	Scanner scan = new Scanner(System.in);
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no = 0,rank = 0, kor = 0, eng = 0, math = 0, total = 0;
	int choice = 0,temp = 0,rankC = 0;  //번호선택, 검색확인,등수
	String name = "";
	double avg = 0.0;
	ArrayList list = new ArrayList();	
	
	// 상단 메뉴 메소드
	int main_print(){
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 등수처리");
		System.out.println("0. 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		return choice;
	}
	
	// 입력 메소드
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		//입력
		while(true) {
			//번호
			System.out.printf("[ %d 번째 ]\n",list.size());
			//이름
			System.out.println("이름을 입력하세요.(0.이전페이지 이동) ");
			name = scan.next();
			//0인지 확인
			if(name.equals("0")) {
				break;
			}					
			//국어,영어,수학
			System.out.printf("국어 점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.out.printf("영어 점수를 입력하세요.\n");
			eng = scan.nextInt();
			System.out.printf("수학 점수를 입력하세요.\n");
			math = scan.nextInt();
			
			//list저장
			list.add(new Stu(name,kor,eng,math));
			
			System.out.printf("%s 학생이 저장되었습니다. \n",name);}		
		}
		
	//출력 메소드
	void output() {
		System.out.println("[ 학생성적 출력 ]");
		//출력
		System.out.println("                       [ 학생성적 ]");
		System.out.println("-------------------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for(int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j);
			System.out.printf("%d \t",s.getNo());
			System.out.printf("%s \t",s.getName());
			System.out.printf("%d \t",s.getKor());
			System.out.printf("%d \t",s.getEng());
			System.out.printf("%d \t",s.getMath());
			System.out.printf("%d \t",s.getTotal());
			System.out.printf("%.2f \t",s.getAvg());
			System.out.printf("%d \n",s.getRank());					
		}
		System.out.println();
		
		}
	
	void modify() {
		int temp = 0;
		Stu s1 = null;
		System.out.println("[ 학생성적 수정 ]");
		// 수정할 학생이름을 입력하시오.
		System.out.println("수정할 학생이름을 입력하세요.>> ");
		String search  = scan.next();
		
		for(int j=0;j<list.size();j++) {
			if(search.equals(((Stu)list.get(j)).getName())) {
				s1 = ((Stu)list.get(j));
				temp = 1;     //검색이 있음.
			}
		}
		
		if(temp == 0) {
			System.out.println("검색한 학생을 찾지 못했습니다.");
		}else {
			System.out.printf("[ %s 학생 성적 수정 ]\n",name);
			System.out.println("1.국어점수수정");
			System.out.println("2.영어점수수정");
			System.out.println("3.수학점수수정");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("[ 국어점수 수정 ]");
				System.out.printf("현재점수 : %d \n", s1.getKor());
				System.out.println("변경점수를 입력하세요. >> ");
				s1.setKor(scan.nextInt());
				break;
			case 2:
				System.out.println("[ 영어점수 수정 ]");
				System.out.printf("현재점수 : %d \n", s1.getEng());
				System.out.println("변경점수를 입력하세요. >> ");
				s1.setEng(scan.nextInt());
				break;
			case 3:
				System.out.println("[ 수학점수 수정 ]");
				System.out.printf("현재점수 : %d \n",s1.getMath());
				System.out.println("변경점수를 입력하세요. >> ");
				s1.setMath(scan.nextInt());
			}//switch
		System.out.printf("% 학생 성적이 수정되었습니다.",s1.getName());
		}
	}
	
	void rank() {
		System.out.println("[ 등수처리 ]");
		for(int j=0;j<list.size();j++) {
			rankC = 1; //리셋
			for(int k=0;k<list.size();k++) {
				if(((Stu)list.get(j)).getTotal()<((Stu)list.get(k)).getTotal()) {
					rankC++;
				}
			}
			((Stu)list.get(j)).setRank(rankC);
		}
		
		System.out.println("등수처리가 완료되었습니다.");
		System.out.println();
	}
	
}
	
