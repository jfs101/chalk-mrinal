package main;

public class HotelBooking{
	User u;
	Date checkIn;
	Date checkOut;
	Hotel h;
	int price;
	public HotelBooking(Hotel h,User u,Date checkIn,Date checkOut) {
		setU(u);
		setCheckOut(checkOut);
		setCheckIn(checkIn);
		setH(h);
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}

	public Hotel getH() {
		return h;
	}
	public void setH(Hotel h) {
		this.h = h;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice() {
		//Write your code here !!!
		
		//to get the month stay subtract checkout month from checkIn month
		//to get the date of stay subtract checkout  date from checkIn date
		//then calc the total no of days stay in hotel 
		//set the price to hotel price multiplied by no of stay days.
	}
}