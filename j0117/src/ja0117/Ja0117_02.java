package ja0117;

public class Ja0117_02 {

	public static void main(String[] args) {
		StuScore s1 = new StuScore();
		s1.no = 1;
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.cal_total();
		s1.cal_avg();
		
		StuScore s2 = new StuScore();
		s2.no = 2;
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.cal_total();
		s2.cal_avg();
		
		StuScore s3 = new StuScore();
		s3.no = 3;
		s3.name = "이순신";
		s3.kor = 77;
		s3.eng = 89;
		s3.cal_total();
		s3.cal_avg();
		
		
		
		
		
		System.out.println(s1.no);
		System.out.println(s1.name);
		System.out.println(s1.kor);
		System.out.println(s1.eng);
		System.out.println(s1.total);
		System.out.println(s1.avg);
		System.out.println(s2.no);
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.total);
		System.out.println(s2.avg);
		System.out.println(s3.no);
		System.out.println(s3.name);
		System.out.println(s3.kor);
		System.out.println(s3.eng);
		System.out.println(s3.total);
		System.out.println(s3.avg);

	}

}
