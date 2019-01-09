package main;

public class Date{
	public int date;
	public int month;
	int year;
	int hour;
	public Date(int hour,int date,int month,int year) {
		setDate(date);
		setMonth(month);
		setYear(year);
		setHour(hour);
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}

}