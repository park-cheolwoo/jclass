package j0121;

public class Deck {
	String[] s = {"Spade", "Diamond", "Heart", "Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	Card[] c = new Card[52];
	
	// 덱 생성자
	Deck(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[13*i+j] = new Card(s[i],j+1);
			}
		}
	};
	
	//카드 전체 출력 메소드
	void print_all(int no) {
		System.out.printf(" [ %d개 출력 ]\n",no);
		System.out.println("--------------------------------------------------------");
		for(int i=0;i<no;i++) {
			System.out.printf(" [%s, %s] \n",c[i].shape,n[c[i].number]);
		}
	}
	
	//오버로딩
	void print_all(Card c) {
		System.out.printf(" [ 카드 확인 ]\n");
		System.out.println("--------------------------------------------------------");
		System.out.printf(" [%s, %s] \n",c.shape,n[c.number]);
	}
	
	Card pick(int no) {
		if(no>1 && no<52) {			
			return c[no];
		} else {
			System.out.println("번호를 확인하셔야 합니다.");
			return c[0];}
	}
	
	
	// 섞기 메소드
	void shuffle() {
		Card temp = null; // 섞기용
		int ranNum = 0; // 랜덤숫자
		for(int i=0;i<200;i++) {
			ranNum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ranNum];
			c[ranNum] = temp;
		}
	}
	
	
}
