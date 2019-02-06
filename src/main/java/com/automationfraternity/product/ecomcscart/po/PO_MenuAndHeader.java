package main.java.com.automationfraternity.product.ecomcscart.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import main.java.com.automationfraternity.core.CmnMethods;
import main.java.com.automationfraternity.core.UIManager;

public class PO_MenuAndHeader {
	
	WebDriver driver;
	UIManager UIManager = new UIManager();
	public PO_MenuAndHeader(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.ID,using = "search_input" )
	WebElement txtbx_search_bx;
	
	@FindBy(how=How.XPATH,using = "//button[@class = 'ty-search-magnifier']" )
	WebElement btn_search_magni;
	
	@FindBy(how=How.ID,using = "//form[@name ='search_form']/input[@id = 'search_input']" )
	WebElement input_search_view_change;
	
	private void SetTextInSearchBox(String text) {
		UIManager.SetElementText(txtbx_search_bx, text);
		CmnMethods.WriteLog("pass", "SetTextInSearchBox");
	}

	private void ClickOnSearchMagnifyingLink() {
		UIManager.ClickElement(btn_search_magni);
		CmnMethods.WriteLog("pass", "ClickOnSearchMagnifyingLink");
		
	}

	public void ClickOnBtnToChangeSearchViewToList(String text) {
		UIManager.ClickElement(input_search_view_change);
		CmnMethods.WriteLog("pass", "ClickOnBtnToChangeSearchViewToList");
	}
	
	public void KW_SearchProductFromSearchTextBox(String text) {
		SetTextInSearchBox(text);
		ClickOnSearchMagnifyingLink();
		
		//Check for Product Search Results is Displayed
		CmnMethods.WriteLog("pass", "Product Searched.");
		
	}
	

	

	  

}
