package j0124;

import java.util.ArrayList;
import java.util.Comparator;

public class Ja0124_02 {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList<Stu>(); // 제네릭 : 특정 타입만 들어오게 제한
		list.add(new Stu("홍길동",100,100,100));
//		list.add(new Card());
//		list.add(1);
		
		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
			System.out.printf("[%d,%s,%d]\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getTotal());
		}
		System.out.println("프로그램 종료");
		
//		list.add(new Stu("유관순",90,90,90));
//		list.add(new Stu("이순신",95,95,95));
//		list.add(new Stu("강감찬",93,93,93));
//		list.add(new Stu("김구",80,80,80));
//		list.add(new Stu("홍길순",75,75,75));
//		
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}
//		
//		list.sort(new Comparator<Stu>() {
//			@Override // 숫자 비교 // @ : 에너테이션 - 주석, 스프링 : 명령어
//			public int compare(Stu s1, Stu s2) {
//				// TODO 자동 생성된 메소드 스텁
//				return s2.getTotal()-s1.getTotal(); // 결과가 +이면 s1,s2의 순서를 바꿈 (s2-s1 : 순차정렬, s1-s2 : 역순정렬)
//			}
//			
//		});
//		
//		System.out.println("-------순차정렬---------");
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}
//		
//		
//		list.sort(new Comparator<Stu>() {
//			@Override // 문자열
//			public int compare(Stu s1, Stu s2) {
//				// TODO 자동 생성된 메소드 스텁
//				return s1.getName().compareTo(s2.getName()); // (s1~s2 : 순차정렬, s2~s1 : 역순정렬)
//			}
//			
//		});
			
//		System.out.println("-------순차정렬---------");
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("[%d,%s,%d]\n",s.getNo(),s.getName(),s.getTotal());
//		}
		
		
		
		
	}

}
