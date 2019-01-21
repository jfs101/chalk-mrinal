package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.Test;

import main.Landing_page;

class Landin_page_testing {

	@Test
	void testlanding_page() {
		Landing_page obj = new Landing_page();
		assertEquals(obj.jf.isVisible(),true);
		assertEquals(obj.jf.isVisible(),true);
		
	}

}
