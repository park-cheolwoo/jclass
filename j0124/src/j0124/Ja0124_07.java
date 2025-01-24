package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ja0124_07 {

	public static void main(String[] args) {
		// C:/save/stu.text를 읽어와서
		// Arraylist에 넣기
		try {
		ArrayList<Stu> list = new ArrayList<Stu>();
		FileReader fr = new FileReader("C://save2/stu.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line ==null) {break;}
//			System.out.println(line);
			String[] str = line.split(",");
			System.out.println(Arrays.toString(str));
			Stu s = new Stu(str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),Integer.parseInt(str[4]));
			list.add(s);
		}
		fr.close();
		br.close();
		for(int i=0;i<list.size();i++) {
			System.out.printf("[%d,%s,%d,%d,%d,%d,%.2f,%d] \n",list.get(i).getNo(),list.get(i).getName(),
					list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),
					list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
