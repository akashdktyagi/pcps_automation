package main.java.com.automationfraternity.core;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

/*
 * Created By Akash Tyagi
 * Date: 1Feb2019
 */
public class TestBase {

	protected static ExtentReports reports;
	protected static ExtentTest test;
	
	public TestBase() {
		reports =  new ExtentReports("E:\\_AkashStuff\\Automation\\EclipseWorkspace\\pcps_automation\\ExtentReportResults.html");;
	}//end method
	
	
}//end class
