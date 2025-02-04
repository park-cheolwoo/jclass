package j0131;

public class Tv extends Product {
	
//	private String name;
//	private int price;
//	private int point;
	
	private int size;
	private String panel;
	private String color;
	
	//기본생성자
	Tv(){
		this("LG50TV",1000000,100000,50,"LED","BLACK");
	}
	
	// 매개변수생성자
	Tv(String name, int price, int point, int size,String panel,String color){
		setName(name);
		setPrice(price);
		setPoint(point);
		this.size = size;
		this.panel = panel;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
