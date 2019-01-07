package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.CustomerName;


/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF YOUR PROJECT !!!
 * 	
 */

class CustomerNameTest {

	@Test
	void customerTest() {
		
		CustomerName cn = new CustomerName();
		String test = "testnameCust";
		cn.setName(test);
		assertEquals(test,cn.getName());
		//	fail("Not yet implemented");
	}

}
