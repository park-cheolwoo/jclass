package ja0120;

import java.util.Scanner;

public class Ja0120_05 {

	public static void main(String[] args) {
		String[] name = new String[3];
		int[] kor = new int[3];
		Scanner scan = new Scanner(System.in);
		
		Cal4 c4 = new Cal4();
		c4.input(name, kor);
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("[%s,%d]\n",name[i],kor[i]);
		}
		// name과 kor를 보내서 데이터를 입력받아 main 메소드에서 출력
	}

}
