package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Cart;
import main.Item;
import main.Shop;
//import main.Item;
class CartTest {

	Cart c;
	Shop s;
	@BeforeEach
	void setUp() throws Exception {
		c = new Cart();
		s = new Shop();
		
	}

	@SuppressWarnings("static-access")
	@Test
	void test() {
//		s.itemAvailable[0]
	    for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
        s.itemAvailable[0].addItem("maggi", 24);
        s.itemAvailable[1].addItem("coffee", 100);
        c.updateCart(s.itemAvailable[0], 5);
        c.updateCart(s.itemAvailable[1], 6);
        assertEquals(2,c.noOfItems);
		
		 
	}
	@Test
	void test2() {
		
		int t = 0;
		for(int i=0;i<c.noOfItems;i++){
			
         //   System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
            t += (c.inCart.get(i).mrp*c.quant.get(i));
            	 
		}
		
		//not negative check
		
		//fail("Not yet implemented");
		 assertEquals(t,c.calcBill());
	}


}
