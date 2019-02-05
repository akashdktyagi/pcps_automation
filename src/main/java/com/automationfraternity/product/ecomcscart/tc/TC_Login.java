package main.java.com.automationfraternity.product.ecomcscart.tc;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import main.java.com.automationfraternity.core.TestBase;

public class TC_Login extends TestBase {

	public TC_Login() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void t_01_validate_login() {
		
		reports.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		test.log(LogStatus.PASS, "Test is Passed");
		reports.endTest(test);
		reports.flush();
		
		
	}
}
