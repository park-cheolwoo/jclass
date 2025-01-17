package ja0117;

public class Ja0117_08 {

	public static void main(String[] args) {
		// 카드 모양 : spade,heart,diamond,clover
		// 숫자 : 1(A),2,3,4,5,6,7,8,9,10,J,Q,K
		// 촣 카드 숫자 : 13*4 = 52장
		
		//13장
		String[] shape = {"spade","clover","heart","diamond"};
		Card[] c = new Card[52];
			for(int i=0;i<c.length;i++) {
			// 객체 선언이 없어서 에러
				c[i] = new Card();
				c[i].kind = shape[i/13];
				c[i].number = (i%13)+1;			
				}
			for(int i=0;i<c.length;i++) {
			System.out.printf("[%s, %d]\n",c[i].kind,c[i].number);
			}
		
//		String[] shape = {"spade","clover","heart","diamond"};
//		Card[] c = new Card[52];
//		for(int j=0;j<shape.length;j++) {
//			for(int i=0;i<(c.length/4);i++) {
//				// 객체 선언이 없어서 에러
//				c[(13*j)+i] = new Card();
//				c[(13*j)+i].kind = shape[j];
//				c[(13*j)+i].number = i+1;			
//			}
//		}
//		for(int j=0;j<shape.length;j++) {
//			for(int i=0;i<(c.length/4);i++) {
//				System.out.printf("[%s, %d]\n",c[(13*j)+i].kind,c[(13*j)+i].number);
//			}
//		}
//		
		
		
//		Card c1 = new Card();
//		c1.kind = "Heart";
//		c1.number = 1;
//		
//		Card c2 = new Card();
//		c2.kind = "Clover";
//		c2.number = 2;
//		
//		System.out.printf("[ %s, %d ] \n",c1.kind,c1.number);
//		System.out.printf("크기 : %d,%d \n",c1.width,c1.height);
//		
//		c2.width = 50;
//		c2.height = 70;
//		System.out.printf("[ %s, %d ] \n",c1.kind,c1.number);
//		System.out.printf("크기 : %d,%d \n",c1.width,c1.height);
		
		
		
	}

}
