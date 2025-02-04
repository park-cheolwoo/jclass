package j0131;

public class Buyer {
	private String id;
	private String pw;
	private String userName;
	private String address;
	private int money;
	private int myPoint;
	
	//생성자
	public Buyer() {}
	public Buyer(String id, String pw, String userName, String address, int money, int myPoint) {
		this.id = id;
		this.pw = pw;
		this.userName = userName;
		this.address = address;
		this.money = money;
		this.myPoint = myPoint;
	}
	
	//getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMyPoint() {
		return myPoint;
	}
	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	
	
	
	

}
