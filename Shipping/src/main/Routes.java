package main;

public class Routes{
	public int distance;
	public Place p1;
	public Place p2;
	public Place getP1() {
		return p1;
	}
	public void setP1(Place p1) {
		this.p1 = p1;
	}
	public Place getP2() {
		return p2;
	}
	public void setP2(Place p2) {
		this.p2 = p2;
	}
	public Routes(int dist,Place p1,Place p2) {
		setDistance(dist);
		setP1(p1);
		setP2(p2);
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}

}