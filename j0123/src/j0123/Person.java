package j0123;

public class Person {
	long id;     //주민등록번호
	String name; //이름
	
	Person(){}
	Person(long id){
		this.id = id;
	}
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override //Object 클래스 메소드
	public String toString() {
		return id+"";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
			return false;			
		}
	}
}
