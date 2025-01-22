package star;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Marine 이동 : %d, %d \n",x,y);
	};

	
}
