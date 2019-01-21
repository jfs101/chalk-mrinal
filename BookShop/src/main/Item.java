package main;

public class Item{
    public String itemName;
    public int mrp;
    public  void addItem(String a,int b){
        //write your code here
    	//-------------------
    	setItemName(a);
    	setMrp(b);
    }
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

    

}