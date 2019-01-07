package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Cart;
import main.Item;
import main.BookShop;

class BillTest {
/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF YOUR PROJECT !!!
 * 	
 */
	
	
	
	@SuppressWarnings("static-access")
	@Test
	void billTest() {
		Cart c = new Cart();
		BookShop s = new BookShop();
		int t = 0;
		
		for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
        s.itemAvailable[0].addItem("maggi", 24);
        s.itemAvailable[1].addItem("coffee", 100);
        c.updateCart(s.itemAvailable[0], 5);
        c.updateCart(s.itemAvailable[1], 6);
		
		
		for(int i=0;i<c.noOfItems;i++){
			
         //   System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
            t += (c.inCart.get(i).mrp*c.quant.get(i));
            	 
		}
		
		//not negative check
		
		//fail("Not yet implemented");
		 assertEquals(t,c.calcBill());
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	void billTest2() {
		Cart c = new Cart();
		BookShop s = new BookShop();
		int t = 0;
		
		for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
		s.itemAvailable[0].addItem("maggi", 40);
        s.itemAvailable[1].addItem("apple", 156);
        s.itemAvailable[2].addItem("orange", 70);
        s.itemAvailable[3].addItem("onion", 16);
        s.itemAvailable[4].addItem("potato", 19);
        s.itemAvailable[5].addItem("eggs", 168);
        s.itemAvailable[6].addItem("whole wheat", 45);
        s.itemAvailable[7].addItem("red label", 140);
        s.itemAvailable[8].addItem("olive oil", 650);
        c.updateCart(s.itemAvailable[0], 1);
        c.updateCart(s.itemAvailable[1], 20);
        c.updateCart(s.itemAvailable[2], 3);
        c.updateCart(s.itemAvailable[3], 45);
        c.updateCart(s.itemAvailable[4], 5);
        c.updateCart(s.itemAvailable[5], 60);
        c.updateCart(s.itemAvailable[6], 6);
        c.updateCart(s.itemAvailable[8], 11);
        
		
		
		for(int i=0;i<c.noOfItems;i++){
			
         //   System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
            t += (c.inCart.get(i).mrp*c.quant.get(i));
            	 
		}
		
		//not negative check
		
		//fail("Not yet implemented");
		 assertEquals(t,c.calcBill());
	}
}
