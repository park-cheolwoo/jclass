package j0120;

import java.util.Scanner;

public class Cal2 {
	
	String[] s() {
		Scanner scan = new Scanner(System.in);
		String[] input = new String[3];
		for(int i=0;i<input.length;i++) {
			input[i] = scan.nextLine();	
		}
		return input;
	}
}
