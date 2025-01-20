package ja0120;

public class Ja0120_07 {

//	Ja0120_07(){} // 기본생성자
	public static void main(String[] args) {
	Data1 d1 = new Data1();
	d1.value = 10;
	d1.name="홍길동";
	d1.kor=100;
	d1.eng=100;
	d1.math=99;
	System.out.println(d1.value);
	Data1 dd2 = new Data1();
	dd2.value = 11;
	dd2.name="유관순";
	dd2.kor = 99;
	dd2.eng = 98;
	dd2.math = 97;
//	Data2 d2 = new Data2(d1.value);
	Data2 d2 = new Data2(1,"홍길동",100,100,99);
	Data2 dd3 = new Data2(2,"유관순",99,98,97);
//	Data2 d4 = new Data2(); // 에러
	System.out.println(d2.value);
	}

}

class Data1{
	int value; // 인스턴스변수 - 객체선언후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
}
class Data2{
	int value; // 인스턴스변수 - 객체선언후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
//	Data2(){}; // 기본생성자
	Data2(int x, String n, int k, int e, int m){
		value = x;
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = kor+eng+math;
		avg = total/3.0;
	}
}

