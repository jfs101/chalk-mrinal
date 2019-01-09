package main;

public class ParcelBooking{
	Routes r;
	User u;
	int weight;
	boolean fragile;
	int price;
	public ParcelBooking(Routes r,User u,int weight,boolean fragile) {
		setR(r);
		setU(u);
		setWeight(weight);
		setFragile(fragile);
	}
	
	public Routes getR() {
		return r;
	}
	public void setR(Routes r) {
		this.r = r;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isFragile() {
		return fragile;
	}
	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice() {
		price = 100;
		price = price *(r.distance)/10;
		price = price + price * (getWeight()/10);
		if(isFragile()) {
			price = price + 500;
		}
		
	}
	
}