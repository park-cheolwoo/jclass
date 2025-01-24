package j0124;

import java.awt.desktop.PrintFilesEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class StuDeck {
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	String name;
	int kor,eng,math,temp, choice;
	String search;
	Scanner scan = new Scanner(System.in);
	
	
	
	//파일읽어오기
	void fileRead() throws Exception {
		FileReader fr = new FileReader("C://save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		int no=0, kor=0, eng=0, math=0, total=0, rank=0;
		String name="";
		double avg = 0.0;
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
		}
		br.close();
		fr.close();
	}
	
	//학생성적입력
	void input() {
		System.out.println(" [ 학생성적입력 ] ");
		while(true) {
			System.out.println("학생 이름을 입력하세요.(이전으로 : 0) >> ");
			name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전 화면으로 이동합니다.");
				break;
			}
			System.out.println("국어 성적을 입력하세요. >> ");
			kor = scan.nextInt();
			System.out.println("영어 성적을 입력하세요. >> ");
			eng = scan.nextInt();
			System.out.println("수학 성적을 입력하세요. >> ");
			math = scan.nextInt();
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s 학생 성적이 입력되었습니다. \n",name);			
		}
	}
	
	
	
	//학생성적출력
	void listPrint() {
		System.out.println(" [ 학생성적출력 ] ");
		System.out.println("----------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
	}
	
	
	// 학생성적수정
	void modify() {
		temp = 0;
		search="";
		System.out.println(" [ 학생성적수정 ] ");
		System.out.println("찾는 학생 이름을 입력하세요. >> ");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(search)) {
				temp=1;
				System.out.printf("%s 학생을 찾았습니다. \n",search);
				System.out.println("1. 국어 성적 수정");
				System.out.println("2. 영어 성적 수정");
				System.out.println("3. 수학 성적 수정");
				System.out.println("0. 성적 수정 취소");
				System.out.println("원하는 번호를 입력하세요. >> ");
				choice = scan.nextInt();
				switch(choice){
				case 1:
					System.out.printf("현재 국어 성적 : %d \n",list.get(i).getKor());
					System.out.println("수정할 국어 성적을 입력하세요. >> ");
					kor = scan.nextInt();
					list.get(i).setKor(kor);
					list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
					list.get(i).setAvg((list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath())/3.0);
					System.out.printf("%s 학생 성적이 수정되었습니다. \n",search);
					break;
				case 2:
					System.out.printf("현재 영어 성적 : %d \n",list.get(i).getEng());
					System.out.println("수정할 영어 성적을 입력하세요. >> ");
					eng = scan.nextInt();
					list.get(i).setEng(eng);
					list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
					list.get(i).setAvg((list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath())/3.0);
					System.out.printf("%s 학생 성적이 수정되었습니다. \n",search);
					break;
				case 3:
					System.out.printf("현재 수학 성적 : %d \n",list.get(i).getMath());
					System.out.println("수정할 수학 성적을 입력하세요. >> ");
					math = scan.nextInt();
					list.get(i).setKor(math);
					list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
					list.get(i).setAvg((list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath())/3.0);
					System.out.printf("%s 학생 성적이 수정되었습니다. \n",search);
					break;
				case 0:
					System.out.println("성적 수정이 취소되었습니다.");
				}
				break;
				}
			}
		if(temp ==0) {
			System.out.printf("%s 학생을 찾지 못했습니다. \n",search);
		}
	}
	
	
	//학생성적삭제
	void delete() {
		temp = 0;
		search="";
		System.out.println(" [ 학생성적삭제 ] ");
		System.out.println("찾는 학생 이름을 입력하세요. >> ");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(search)) {
				temp=1;
				System.out.printf("%s 학생을 찾았습니다. \n",search);
				System.out.printf("%s 학생 성적을 삭제하시겠습니까?(예:1, 아니오:0) >> \n",search);
				choice = scan.nextInt();
				switch(choice) {
				case 1:
					list.remove(i);
					System.out.printf("%s 학생 성적이 삭제되었습니다.\n",search);
				default:
					System.out.println("성적 삭제가 취소되었습니다.");
				}
			break;
			}
		}
		if(temp ==0) {
			System.out.printf("%s 학생을 찾지 못했습니다. \n",search);
		}
	}
		
	//학생성적검색
	void search() {
		temp = 0;
		search="";
		System.out.println(" [ 학생성적검색 ] ");
		System.out.println("찾는 학생 이름을 입력하세요. >> ");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(search)) {
				temp=1;
				
				System.out.printf("%s 학생을 찾았습니다. \n",search);
				System.out.println(" [ 학생성적출력 ] ");
				System.out.println("----------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
				break;
			}
		}		
		if(temp ==0) {
			System.out.printf("%s 학생을 찾지 못했습니다. \n",search);
		}
	}
	
	// 학생등수정렬
	void orderRank() {
		System.out.println(" [ 학생등수정렬 ] ");
		list.sort(new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				return s2.getTotal()-s1.getTotal(); // 성적 높은 사람이 상단
			}
			
		});
	}
	
	// 학생이름정렬
	void orderName() {
		System.out.println(" [ 학생이름정렬 ] ");
		list.sort(new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
	}
	
	
	
	// 학생등수처리
	void rank() {
		System.out.println(" [ 학생등수처리 ] ");
		orderRank();
		for(int i=0;i<list.size();i++) {
			list.get(i).setRank(i+1);
		}
	}
	
	// 파일저장
	void save() {
		System.out.println(" [ 파일저장 ] ");
		try {
			String folder = "C://save/";
			File f = new File(folder);
			if(!f.exists()) {
				f.mkdirs();
			}
			File file = new File(folder+"stuData2.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fr = new FileWriter("C://save/stuData2.txt");
			BufferedWriter br = new BufferedWriter(fr);
			for(int i=0;i<list.size();i++) {
				String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d",
						list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),
						list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
				br.write(str+"\r\n");
			}
			System.out.println("파일 저장이 완료되었습니다.");
			br.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
} // Class
