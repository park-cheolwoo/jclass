package ja0115;

public class Ja0115_06 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		
		// 1~45까지
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1;
		}
		
		// 1~45까지 순차출력
		for(int i=0;i<ball.length;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
		//랜덤 숫자
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*44);
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		// 1~45까지 랜덤출력
		for(int i=0;i<ball.length;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	}

}
