package main;
import static org.junit.Assert.*;

import org.junit.Test;
import main.SampleProject;
public class TestCase {
SampleProject sm;
	@Test
	public void testAdd() {
		sm = new SampleProject();
		int a = 23+45;
		assertEquals(a,sm.add(23, 45));
	}
	public void testHello() {
		sm = new SampleProject();
		
		assertEquals("Hello World!",sm.printHello());
	}
}
