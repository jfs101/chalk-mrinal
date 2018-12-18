package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.CustomerName;

class CustomerNameTest {

	@Test
	void test() {
		
		CustomerName cn = new CustomerName();
		String test = "testnameCust";
		cn.setName(test);
		assertEquals(test,cn.getName());
		//	fail("Not yet implemented");
	}

}
