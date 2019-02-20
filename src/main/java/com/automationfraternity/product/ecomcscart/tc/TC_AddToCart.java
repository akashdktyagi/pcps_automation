package main.java.com.automationfraternity.product.ecomcscart.tc;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import main.java.com.automationfraternity.core.BrowserManager;
import main.java.com.automationfraternity.core.CmnMethods;
import main.java.com.automationfraternity.core.ReportingConfig;
import main.java.com.automationfraternity.product.ecomcscart.po.PO_MenuAndHeader;
import main.java.com.automationfraternity.product.ecomcscart.po.PO_Search;

public class TC_AddToCart extends ReportingConfig {

	@Test(groups="smoke",description="Smoke Test For Search funtionality without login",enabled=true)
	public void t_01_add_to_cart_after_login_single_product_single_quantity() {
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

			//Add Product to cart and Validate
			PO_Search.ClickOnBtnToChangeSearchViewToList();
			PO_Search.KW_ClickAndValidateAddToCart(0);


		}catch(Exception e) {
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getLocalizedMessage());
			e.printStackTrace();

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
}
