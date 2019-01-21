package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Register_page;

class Register_test {

	@Test
	void testregister_page() {
		Register_page obj = new Register_page();
		assertEquals(obj.f.isVisible(),true);
		assertEquals(obj.f.isVisible(),true);
	}

}
