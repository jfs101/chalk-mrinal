package main;

public class Hotel{
	String hotelName;
	int hotelId;
	Place hotelPlace;
	public int price;
	public Hotel(String hName,int Id,Place hPlace,int price) {
		setHotelName(hName);
		setHotelId(Id);
		setHotelPlace(hPlace);
		setPrice(price);
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public Place getHotelPlace() {
		return hotelPlace;
	}
	public void setHotelPlace(Place hotelPlace) {
		this.hotelPlace = hotelPlace;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
