package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class TestingCalc {
	Calculator c;
	@SuppressWarnings("static-access")
	@Test
	void mul_test() {
		c = null;
		assertEquals(4*7,c.mult(4,7));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void addition_test() {
		assertEquals(4+7,c.add(4,7));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void sub_test() {
		assertEquals(4-7,c.sub(4,7));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void div_test() {
		
		assertEquals(14/7,c.div(14,7));
	}

}
