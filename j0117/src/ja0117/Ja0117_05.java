package ja0117;

public class Ja0117_05 {

	public static void main(String[] args) {
		//객체선언
//		Stu s1 = new Stu();
//		s1.id = "aaa";
//		s1.pw = "1111";
//		s1.name = "홍길동";
//		s1.age = 20;
//		Stu s2 = new Stu();
//		s2.id = "bbb";
//		s2.pw = "2222";
//		s2.name = "유관순";
//		s2.age = 24;
//		Stu s3 = new Stu();
//		s3.id = "ccc";
//		s3.pw = "3333";
//		s3.name = "이순신";
//		s3.age = 22;
		
		//배열선언
		Stu[] s = new Stu[3];
		s[0] = new Stu();
		s[0].id = "aaa";
		s[0].pw = "1111";
		s[0].name = "홍길동";
		s[0].age = 20;
		
		s[1] = new Stu();
		s[1].id = "bbb";
		s[1].pw = "2222";
		s[1].name = "유관순";
		s[1].age = 24;
		
		s[2] = new Stu();
		s[2].id = "ccc";
		s[2].pw = "3333";
		s[2].name = "이순신";
		s[2].age = 22;
		
	}

}
