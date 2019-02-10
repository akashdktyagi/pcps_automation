package com.automationfraternity.product.ecomcscart.tc;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.automationfraternity.core.BrowserManager;
import com.automationfraternity.core.CmnMethods;
import com.automationfraternity.core.Reporting_Config;
import com.automationfraternity.product.ecomcscart.po.PO_CscartProductSearch;
import com.relevantcodes.extentreports.LogStatus;









public class TC_Cscart_Product_Search extends  Reporting_Config
{
	/**Pawan Khedkar
	*
	**/	

		 //@Test(dataProvider="SearchItem",groups="sanity",description="Smoke Test For Search funtionality")
		@Test(groups="smoke",description="Smoke Test For Search funtionality",enabled=true)
		public void tc_search_single_Product() {
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
				//String product = "computer";
				 PO_CscartProductSearch  PO_Search_Product = new  PO_CscartProductSearch (driver);
				 PO_Search_Product.SearchProductFromSearchTextBox("computer");
				 PO_Search_Product.Submit_TextBox_Btn();
				 PO_Search_Product.Go_To_ListBox_For_Addtocart_Product();
				 PO_Search_Product.Fetch_the_Code_Of_Asus("H0217E3OE9");
				 PO_Search_Product.Fetch_the_Price_Of_Asus("610.99");
				 PO_Search_Product.Increase_Quantity_Of_Product();
				 PO_Search_Product.Decrease_Quantity_Of_Product();
				 PO_Search_Product.AddToCart_Product();


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

		

