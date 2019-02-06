package main.java.com.automationfraternity.core;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import main.java.com.automationfraternity.utilities.DateAndTimeManager;

/*
 * Created By Akash Tyagi
 * Date: 1Feb2019
 */
public class ReportingConfig {

	public static ExtentReports REPORTS;
	public static ExtentTest TEST;
	
	
	public ReportingConfig() {
		REPORTS =  new ExtentReports(Config.FW_ROOT + "\\HighLevelLogs\\ExtentReport_" + DateAndTimeManager.f_generate_time_based_unique_integer() + ".html");;
		
	}//end method
	
	
}//end class
