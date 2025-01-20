package ja0120;
import java.util.Arrays;

public class Ja0120_02 {

	public static void main(String[] args) {
		Arr a = new Arr();
		System.out.println(Arrays.toString(a.num));
		cal(a.num); // 배열 > 주소값을 넘겨줌 > 메소드 실행 후에도 값이 유지됨
		System.out.println(Arrays.toString(a.num));

	}

	static void cal(int[] num) {
		// num 배열에 10을 더해서 값을 돌려줌
		for(int i=0;i<num.length;i++) {
			num[i] += 10;
		}
	}
}
