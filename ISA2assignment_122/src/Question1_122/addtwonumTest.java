package Question1_122;

import static org.junit.Assert.*;

import org.junit.Test;

public class addtwonumTest {

	 @Test
	    public void testAddPositiveNumbers() {
	        assertEquals(16, addtwonum.add(10, 6));
	    }

	    @Test
	    public void testAddNegativeNumbers() {
	        assertEquals(-2, addtwonum.add(-5, 3));
	    }
	

}
