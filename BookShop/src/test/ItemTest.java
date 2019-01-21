package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Cart;
import main.Item;


/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF YOUR PROJECT !!!
 * 	
 */

class ItemTest {
	
	
	Item i;
	@BeforeEach
	void setUp() throws Exception {
	 i = new Item();
	}
	String n;
	@Test
	void itemTest() {
		
		 n = "testName";
		int mrp = 4535;
		i.addItem(n, mrp);
		
		
		
		assertEquals(mrp,i.getMrp());
		//fail("Not yet implemented");
	}


}
