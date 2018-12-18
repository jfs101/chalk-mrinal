package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Cart;
import main.Item;

class ItemTest {
	
	
	Item i;
	@BeforeEach
	void setUp() throws Exception {
	 i = new Item();
	}
	String n;
	@Test
	void test() {
		
		 n = "testName";
		int mrp = 4535;
		i.setItemName(n);
		i.setMrp(mrp);
		
		
		
		assertEquals(mrp,i.getMrp());
		//fail("Not yet implemented");
	}
	@Test
	void test2() {
		assertEquals(n,i.getItemName());
	}

}
