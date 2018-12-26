package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.Hostel;


class StudentTest {

	@SuppressWarnings("static-access")
	@Test
	void test() throws IOException {
		boolean chk = true;
		Hostel h = new Hostel();
		
		BufferedWriter out = new BufferedWriter(new FileWriter("hostel.txt"));
			
			out.write("test rNo");
			chk=true;
			BufferedReader read = new BufferedReader(new FileReader("hostel.txt"));
			 String line = null;
	            while ((line = read.readLine()) != null) {
	                if(line.equalsIgnoreCase("test rNo")) {
	                	chk = false;
	                	break;
	                }
	            }
		
		assertEquals(chk,h.verifyName("test rNo"));
		
		
		
		
//		fail("Not yet implemented");
	}

}
