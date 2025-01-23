package j0120;


public class Stuscore {
	
	{
	count++;
	this.no = count;
	} // 초기화 블록
	
	
	Stuscore(){ // 1. 기본생성자
//		this.no = count;
//		count ++;
	}
	Stuscore(String name){
//		this.no = count;
//		count ++;
		this.name = name;
		
	}
	Stuscore(String name, int kor, int eng, int math){ //2. 매개변수 생성자
//		this.no = count;
//		count ++;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
	
	static int count; //클래스변수 - 객체선언없이 클래스명.변수명 (공용)
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void print() {
		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",this.no, this.name, this.kor, this.eng, this.math, this.total, this.avg);
	}
}
