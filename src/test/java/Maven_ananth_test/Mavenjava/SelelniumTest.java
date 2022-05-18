package Maven_ananth_test.Mavenjava;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelelniumTest {

    @BeforeMethod
    public void b4test() {
    	System.out.println("HI I am before method for selenium class!!!!");
    }
    
	@Test(groups="smoke")
	public void selenium_test_1() {
		System.out.println("selenium_test_1");
	}
	@Test
	public void selenium_test_2() {
		System.out.println("selenium_test_2");
	}
}
