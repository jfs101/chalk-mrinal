package main;

public class BusBooking{
//	Place from;
//	Place to;
	User u;
	public Date boardingDate;
	Bus b;
	int price;
	String Ticket;
	public String getTicket() {
		//write your code here !!!
	    // get the starting city-name and destination city-name
		// the format for the ticket is  FromStartingcity | to | destination-city | boarding date
		
		return Ticket;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = b.price;
	}
	public Bus getB() {
		return b;
	}
	public void setB(Bus b) {
		this.b = b;
	}
	public Date getBoardingDate() {
		return boardingDate;
	}
	public void setBoardingDate(Date boardingDate) {
		this.boardingDate = boardingDate;
	}
	public BusBooking(Bus b,User u,Date BD) {
		setU(u);
		setBoardingDate(BD);
		setB(b);
	}
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}

}