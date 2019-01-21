package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Login_page;

class Login_test {

	@Test
	void testlogin_page() {
		Login_page obj = new Login_page();
		assertEquals(obj.jf.isVisible(),true);
		assertEquals(obj.jf.isVisible(),false);
		
	}

}
