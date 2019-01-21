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
		// write your code here !!! 
		// the  base price of parcel booking is  100
		price = 100;
		//divide the distance between two cities by 10 & multiply by price & set the price is equal to product
		// get the weight of parcel and divide it by 10 multiply by price add it to the existing price
		// check if the product is fragile add 500 more to the price.
	
	}
	
}