package Question8_122;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	 @Test
	    public void testCalculateDA() {
	        Employee employee = new Employee("John Doe", "Software Engineer", 70000);
	        double da=employee.calculateDA();
	        assertEquals(7000.0,da,0.01);
	    }

}
