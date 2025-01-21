package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		
		// 전체 출력
		d.print_all(52);

		// 섞기 실행
		d.shuffle();
		
		// 10번째 카드를 선택해서 출력
		Card c = d.pick(10);
		d.print_all(c);
		
		// 5개 출력
		d.print_all(5);
		}

}
