package main.java.com.automationfraternity.product.ecomcscart.po;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



/*
 * @author Pallavi A
 * Dt: 05/02/2019
 */

public class PO_Search_Pallavi 
{
	WebDriver driver;
	UIManager UIManager
	/*======================================================================
	                     locators for click on brand
	  ======================================================================*/ 

	@FindBy(how=How.XPATH,using="//*[@id='sw_elm_filter_10']")
	private WebElement brand_link;

	@FindBy(how=How.XPATH,using="//*[@id='elm_checkbox_39_10_88']")
	private WebElement asus_link;

	@FindBy(how=How.XPATH,using="//*[@id='elm_checkbox_39_10_125']")
	private WebElement casio_link;

	@FindBy(how=How.XPATH,using="//*[@id='elm_checkbox_39_10_109']")
	private WebElement motorola_link;

	@FindBy(how=How.XPATH,using="//*[@id='elm_checkbox_39_10_110']")
	private WebElement nokia_link;

	@FindBy(how=How.XPATH,using="//*[@id='elm_checkbox_39_10_98']")
	private WebElement panasonic_link;
	
	@FindBy(how=How.XPATH,using="//*[@id='elm_checkbox_39_10_89']")
	private WebElement samsung_link;

	//===========================================================================

	/*
	 * generic method locators
	 */

	@FindBy(how=How.XPATH,using=("//*[@id='pagination_contents']/div[1]/div[1]/a[3]/i"))
	private WebElement pagination_view;

	@FindBy(how=How.XPATH,using="//*[@id='sku_update_217']/span")
	private WebElement get_prod_code;

	@FindBy(how=How.XPATH,using="//*[@id='qty_217']/div/a[1]")
	private WebElement incr_prod;

	@FindBy(how=How.XPATH,using="//*[@id='qty_217']/div/a[2]")
	private WebElement decr_prod;

	@FindBy(how=How.XPATH,using="//*[@id='button_cart_217']")
	private WebElement add_to_cart_link;

	@FindBy(how=How.XPATH,using="//*[@id='sw_dropdown_8']/a/i")
	private WebElement view_cart_link;

	/*============================================================================
	    filter by  price selector 
	=============================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id='sw_elm_filter_1']") //price
	private WebElement price_selector_link;
	
	@FindBy(how=How.XPATH,using="//*[@id='slider_39_1']/span[1]")
	private WebElement left_slider; //view price left

	@FindBy(how=How.XPATH,using="//*[@id='slider_39_1']/span[2]")
	private WebElement right_slider;

	@FindBy(how=How.XPATH,using="//*[@id='slider_39_1_left']")
	private WebElement priceselector;
	//===========================================================================


	//method to click on various brand

	public void brand() {
		// TODO Auto-generated method stub
		brand_link.click();
	}
	public void click_asus(){
		asus_link.click();
	}
	public void click_casio(){
		casio_link.click();
	}
	public void click_motorola(){
		motorola_link.click();
	}
	public void click_nokia(){
		nokia_link.click();
	}
	public void click_samsung(){
		samsung_link.click();
	}
	//============================================================================================

	/*public void selectbrand(String brandname)
	{
		Select nm=new Select(click_on_brand);
		nm.selectByVisibleText(brandname);
		click_on_brand.click();
		click_on_asus.click();
	}*/


	public void add_cart() 
	{
		brand_link.click();
		asus_link.click();

		try{
			Thread.sleep(2000);
			pagination_view.click();

		}catch(Exception e)
		{
			//do nothing
		}//end catch

		//String code = get_prod_code.getText();
		incr_prod.click();
		add_to_cart_link.click();
		try {
			Thread.sleep(2000);
			view_cart_link.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

	/*======================================================================================
			methods for filter by price
    ====================================================================================*/
	public void select_by_price()
	{
		price_selector_link.click();
	}

	//left side selector
	public void sliderdisp_left_link()
	{
		try {
			
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.clickAndHold(left_slider).moveByOffset(200, 0).release( left_slider).build().perform();
			left_slider.click();
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}

	//right side selector
	public void MoveSlider_right()
	{
		try{
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.clickAndHold(right_slider).moveByOffset(-100, 100000).release(right_slider).build().perform();
			right_slider.click();
		}catch(Exception e)
		{
			//do nothing
		}//end of catch block 

	}

	//set price
	public void Select_Price()
	{
		priceselector.clear();
		priceselector.sendKeys(Keys.chord("100",Keys.TAB));
		//Use the Keys.chord() method 
		//to type a sequence of 
		//characters into the textbox.
	}




}
