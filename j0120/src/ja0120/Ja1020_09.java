package ja0120;

public class Ja1020_09 {

	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1.serialNo);
		Product p2 = new Product();
		System.out.println(p2.serialNo);
		Product p3 = new Product();
		System.out.println(p3.serialNo);
		
		System.out.println("count : "+Product.count);
	}

}

class Product{
	static int count = 0;
	int serialNo;
	
	// 초기화블럭
	{
		count++;
		serialNo = count;
	}
	
}