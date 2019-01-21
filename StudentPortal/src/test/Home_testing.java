package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Home;

class Home_testing {

	@Test
	void testhome() {
		Home obj = new Home();
		assertEquals(obj.f.isVisible(),true);
	}

}
