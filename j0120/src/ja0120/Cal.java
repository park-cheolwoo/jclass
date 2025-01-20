package ja0120;

public class Cal {
	Cal(){} // 기본생성자
	
	public int multi(int a,int b) {
		int result = a*b;
		return result;
	}
	
	int add(int a,int b){
		return a+b;
	}
	
	int sub(int a,int b){
		return a-b;
	}
	
	double div(int a, int b){
		return a/(double)b;
	}
}