package main;

public class Bus{
	String BusName;
	int BusNo;
	public Routes r;
	int price;
	String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Bus(String name,int num,Routes r,int price) {
		setBusName(name);
		setBusNo(num);
		setR(r);
		setPrice(price);
	}
	public String getBusName() {
		return BusName;
	}
	public void setBusName(String busName) {
		BusName = busName;
	}
	public int getBusNo() {
		return BusNo;
	}
	public void setBusNo(int busNo) {
		BusNo = busNo;
	}
	public Routes getR() {
		return r;
	}
	public void setR(Routes r) {
		this.r = r;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}