package j0123;

public class Stu {
	static int count = 0;

	private int no, kor, eng, math, total, rank;
	private String name;
	private double avg;

	Stu(){};
	Stu(String name, int kor, int eng, int math){
		this.no = count++; //자동
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math; //자동
		this.avg = this.total/3.0; //자동
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	// 부모(Object)와 자식(Stu)의 메소드명이 동일하면 자식의 메소드가 호출됨
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return super.toString();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Stu) {
			return name == ((Stu)obj).name;
		}
		return super.equals(obj);
	}
	
	
	
}
