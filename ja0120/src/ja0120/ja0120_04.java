package ja0120;

import java.util.Arrays;

public class ja0120_04 {

	public static void main(String[] args) {
		// 두 수를 Cal3에 보내면 +,-,* 의 값을 리턴해서 출력
		Cal3 c3 = new Cal3();
		int[] result = new int[3];
		int a = 10;
		int b = 3;
		c3.op(a, b, result);
		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
//		// Cal2에서 이름을 입력받아
//		// main 메소드에서 str 변수로 넘겨받아 출력.
//		Cal2 c = new Cal2();
//		String[] input = c.s();
//		System.out.println(Arrays.toString(input));
//		}
//		
		
		
		
//		// 입력부분 class로 분리
//		Input i = new Input();
//		// 5개를 입력받아 출력
//		int[] result = new int[5];
//		for(int j=0;j<result.length;j++) {
//			result[j] = i.valInput();
//		}
//		for(int j=0;j<result.length;j++) {
//			System.out.printf("%d번째 입력값 : %d \n",j+1,result[j]);
//		}
		
		
		
//		int a = 20;
//		int b = 10;
//		
//		Cal c = new Cal();
//		int result = c.multi(a,b);
//		System.out.println("result : "+result);
//		
//		int result2 = c.add(a, b);
//		System.out.println("result2 : "+result2);
//		
//		int result3 = c.sub(a, b);
//		System.out.println("result3 : "+result3);
//		
//		double result4 = c.div(a, b);
//		System.out.println("result4 : "+result4);
	}
}