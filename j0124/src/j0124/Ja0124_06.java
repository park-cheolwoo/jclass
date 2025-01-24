package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Ja0124_06 {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList<Stu>();
		list.add(new Stu("홍길동",100,100,99));
		list.add(new Stu("유관순",90,90,99));
		list.add(new Stu("이순신",80,80,89));
		
		//list 파일에 들어있는 내용을 stu.txt
		// 1,홍길동,100,100.300,100.0,0
		// 들어가있는 3명의 학생성적을 stu.txt파일에 저장하시오.
		
		try {
			FileWriter fr = new FileWriter("C://save2/stu.txt");
			BufferedWriter br = new BufferedWriter(fr);
			for(int i=0;i<list.size();i++) {
				list.get(i);
				String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d",
						list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),
						list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
//				br.write(list.get(i).getNo()+","+list.get(i).getName()+","+list.get(i).getKor()+","+list.get(i).getEng()+","+list.get(i).getMath()+","+list.get(i).getTotal()+","+list.get(i).getAvg()+","+list.get(i).getRank()+"\r\n");
				br.write(str+"\r\n");
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("쓰기 종료");
		
		
		
		
		
		
	
		// save2/stu.txt로 아래의 글을 저장
//		String[] str = new String[4];
//		str[0] = "1,홍길동,100,100,99";
//		str[1] = "2,유관순,90,90,99";
//		str[2] = "3,이순신,80,80,89";
//		str[3] = "4,강감찬,80,80,89";
//		
//		
//		try {
//			FileWriter fw = new FileWriter("C://save2/stu.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			for(int i=0;i<str.length;i++) {
////				System.out.println(str[i]);
//				bw.write(str[i]+"\r\n");
//			}
//			bw.close(); // 닫아주지 않으면 저장되지 않음
//			fw.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//			str[3] = "4,강감찬,80,80,89";
//			try {
//				FileWriter fw = new FileWriter("C://save2/stu.txt",true); // true : 이어쓰기, false : 덮어쓰기
//				BufferedWriter bw = new BufferedWriter(fw);
//				for(int i=3;i<4;i++) {
////				System.out.println(str[i]);
//					bw.write(str[i]+"\r\n");
//				}
//				bw.close(); // 닫아주지 않으면 저장되지 않음
//				fw.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		System.out.println("쓰기 종료");
//	
//	
//		try {
//			FileReader fr = new FileReader("C://save2/stu.txt");
//			BufferedReader br = new BufferedReader(fr);
//			for(int i=0;i<str.length;i++) {
//				String line = br.readLine();
//				System.out.println("line "+i+" : "+line);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}
//		System.out.println("읽기 종료");
	
	
	}
	
}
