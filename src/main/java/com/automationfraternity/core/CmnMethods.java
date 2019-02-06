package main.java.com.automationfraternity.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CmnMethods extends ReportingConfig{

	
	
	public static void WriteLog(String logtype, String msg) {
		 //TEST =  REPORTS.startTest();
		String stepName = Thread.currentThread().getStackTrace()[1].getMethodName();
		if (logtype.equalsIgnoreCase("pass")) {
			TEST.log(LogStatus.PASS, msg);
		}else if (logtype.equalsIgnoreCase("fail")) {
			TEST.log(LogStatus.FAIL, msg);
		}else if (logtype.equalsIgnoreCase("warn")) {
			TEST.log(LogStatus.WARNING, msg);
		}
		
		System.out.println(logtype+ " " + msg);
	}
	


	
}