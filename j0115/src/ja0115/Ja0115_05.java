package ja0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_05 {

	public static void main(String[] args) {
		// 이름, 국어점수 - 5명의 학생의 국어,영어,평균성적을 입력하려고 함.
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		
		// 이름,국어,영어를 입력받아 합계,평균 출력 / 평균 출력 소숫점 3자리
		for(int i=0;i<name.length;i++) {			
			System.out.printf("%d번째 이름을 입력하세요.",i+1);
			name[i] = scan.next();
			System.out.printf("%d번째 국어점수를 입력하세요.",i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d번째 영어점수를 입력하세요.",i+1);
			eng[i] = scan.nextInt();
			total[i] = kor[i]+eng[i];
			avg[i] = total[i]/2.0;
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(eng));
		for(int i=0;i<name.length;i++) {
			System.out.print(total[i]+" ");
		}
		System.out.println();
		for(int i=0;i<name.length;i++) {
			System.out.printf("%.3f ",avg[i]);
		}
			
		
		
		
		
		
		
		
//		String name = "";
//		int kor=0;
//		System.out.println(name);
//		System.out.println(kor);
//		
//		int[] num = new int[10];
//		for(int i=0;i<10;i++) {
//			System.out.println(num[i]);
//			}
		
	}

}
