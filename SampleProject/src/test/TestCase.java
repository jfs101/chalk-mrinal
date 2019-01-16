package test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * EDITING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF THE PROJECT
 * DONT EDIT TEST FILES !!!
 * 
 */

import org.junit.jupiter.api.Test;
import main.SampleProject;
class TestCase {

SampleProject sm;
	@SuppressWarnings("static-access")
	@Test
	void testHello() {
		sm = new SampleProject();
		
		assertEquals("Hello World!",sm.printHello());
	}
	
	@SuppressWarnings("static-access")
	@Test
	void testAdd() {
		sm = new SampleProject();
		int a = 23+45;
		assertEquals(a,sm.add(23, 45));
	}
}
