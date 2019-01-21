package test;

import static org.junit.jupiter.api.Assertions.*;
import main.ParcelBooking;
import main.Place;
import main.Routes;
import org.junit.jupiter.api.Test;

import main.HotelBooking;
import main.Hotel;
import main.User;
import main.Bus;
import main.BusBooking;
import main.Date;


/*
 * ANY CHANGES TO TEST FILES WILL LEAD TO DISQUALIFICAITON OF PROJECT!!!
 * 
 */
class PriceTest {
HotelBooking hb;
Hotel h;
Place p;
User u;
Date cIn;
Date cOut;
ParcelBooking pb;
Routes r;
BusBooking b;
Bus bus;
	@Test
	void hotelpricetest() {
		cIn = new Date(6,6,6,2018);
		cOut = new Date(18,7,7,2018);
		u = new User("testuser",'M',23);
		p = new Place("testCity",560068,"testState","India");
		h = new Hotel("testHotel",123,p,342);
		hb = new HotelBooking(h,u,cIn,cOut);
		hb.setPrice();
		assertEquals(h.price*((cOut.date - cIn.date)+((cOut.month - cIn.month)*30)),hb.getPrice());
	}
	
	@Test
	void parcelpricetest() {
		r = new Routes(23,p,p);
		pb = new ParcelBooking(r,u,23,true);
		pb.setPrice();
		int p = 100 *(r.distance)/10;
		assertEquals((p+p*(23/10))+500,pb.getPrice());
	//1029   1190
	}
	
	@Test
	void test() {
		p = new Place("testCity",560068,"testState","India");
		cIn = new Date(6,6,6,2018);
		r = new Routes(23,p,p);
		bus = new Bus("test",123,r,321);
		b = new BusBooking(bus,u,cIn);
		String tic = "From"+p.getCityname();
		tic = tic +" | "+"to"+" | "+p.getCityname()+" | "+b.boardingDate.date; 
		assertEquals(tic,b.getTicket());
	}
	
	
}
