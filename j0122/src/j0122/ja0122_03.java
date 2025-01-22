package j0122;

public class ja0122_03 {

	public static void main(String[] args) {
		// text,caption()
		CaptionTv c = new CaptionTv();
		c.text = "[뮤직비디오] 로제-APT";
		System.out.println("자막 : "+c.text);
		//power,channel,power(),channelUp(), channelDown()
		c.Caption();
		Tv t = new Tv();
//		t.text = "자막기능이 없음."
		Tv t2 = new Tv();
//		t2.caption();
		
//		CaptionTv c2 = new Tv(); // 자손의 참조변수 = 부모 객체 는 안됨
		Tv t3 = new CaptionTv(); // 부모의 참조변수 = 자손 객체 는 가능(공간은 있지만 사용은 불가)
		CaptionTv c3;
		c3 = (CaptionTv)t3; // 형변환을 하면 공간을 사용할 수 있음(자손 > 부모 : 형변환 생략 / 부모 > 자손 : 형변환 작성)
		c3.text = "aaa";
		t = c3;
		System.out.println(c3.text);
		
		//에러
//		c3 = (CaptionTv)t2;
//		c3.text = "bbb";
		
		
		// 다형성 : 부모의 참조변수로 자손의 객체를 다룰 수 있지만 역은 안됨
	}

}
