package main.java.com.automationfraternity.product.ecomcscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import main.java.com.automationfraternity.core.BrowserManager;
import main.java.com.automationfraternity.core.CmnMethods;
import main.java.com.automationfraternity.core.ReportingConfig;
import main.java.com.automationfraternity.product.ecomcscart.po.PO_MenuAndHeader;
import main.java.com.automationfraternity.product.ecomcscart.po.PO_MyAccount;
import main.java.com.automationfraternity.product.ecomcscart.po.PO_Search;

public class TC_Login extends ReportingConfig {


	@Test(groups="smoke",description="Smoke Test For Login",enabled=true)
	public void t_01_cs_cart_validate_login() {
		try {
			
			//************************************************************************
			//**********************Init**********************************************
			//************************************************************************
			TEST =  REPORTS.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			TEST.log(LogStatus.INFO, "Test Started");

			//************************************************************************
			//**********************Steps**********************************************
			//************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");

			//Navigate
			oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
			PO_MyAccount PO_MyAccount = new PO_MyAccount(driver);

			PO_MyAccount.LoginInToApp();

		}catch(Exception e) {
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());
		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);


	}//end method
	

	 //@Test(dataProvider="SearchItem",groups="sanity",description="Smoke Test For Search funtionality")
	@Test(groups="smoke",description="Smoke Test For Search funtionality",enabled=true)
	public void t_02_search_single_product_after_login() {
		try {
			//************************************************************************
			//**********************Init******************************************
			//************************************************************************
			TEST =  REPORTS.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			TEST.log(LogStatus.INFO, "Test Started.");

			//************************************************************************
			//**********************Open And Navigate*********************************
			//************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");
			oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
			
			PO_MyAccount PO_MyAccount = new PO_MyAccount(driver);
			PO_MyAccount.LoginInToApp();
			
			//************************************************************************
			//**********************Test Steps****************************************
			//************************************************************************
			String product = "computer";
			PO_MenuAndHeader PO_MenuAndHeader = new PO_MenuAndHeader(driver);
			PO_MenuAndHeader.KW_SearchProductFromSearchTextBox(product);
			
			PO_Search PO_Search = new PO_Search(driver);
			PO_Search.KW_ValidateSearchResultsIsDisplayed();


		}catch(Exception e) {
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());

		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);


	}//end method

	@Test(groups="smoke",description="Smoke Test For Search funtionality without login",enabled=true)
	public void t_03_search_single_product_without_login() {
		try {
			//************************************************************************
			//**********************Init******************************************
			//************************************************************************
			TEST =  REPORTS.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			TEST.log(LogStatus.INFO, "Test Started.");

			//************************************************************************
			//**********************Open And Navigate*********************************
			//************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");
			oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
			
			//************************************************************************
			//**********************Test Steps****************************************
			//************************************************************************
			String product = "computer";
			PO_MenuAndHeader PO_MenuAndHeader = new PO_MenuAndHeader(driver);
			PO_MenuAndHeader.KW_SearchProductFromSearchTextBox(product);
			
			PO_Search PO_Search = new PO_Search(driver);
			PO_Search.KW_ValidateSearchResultsIsDisplayed();


		}catch(Exception e) {
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());

		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);


	}//end method
	
	
	@AfterClass
	public void CleanUp() {

		REPORTS.flush();
		
	}
	

}//end Class
