package main.java.com.automationfraternity.product.ecomcscart.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_CsCart_ProductType 
{
	WebDriver driver;
	public PO_CsCart_ProductType(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account;
	
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in;
	
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username;
	
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In_Log;
	
	@FindBy(how=How.XPATH,using="//input[@type='text' and @id='search_input']")
	private WebElement Search_Computer;

	@FindBy(how=How.XPATH,using="//button[@title='Search']")
	private WebElement Click_On_Computer;

	@FindBy(how=How.XPATH,using="//div[@class='ty-horizontal-product-filters-dropdown__wrapper cm-combination']")
	private WebElement Click_on_Brand;

	@FindBy(how=How.XPATH,using="//input [@class='cm-product-filters-checkbox' and @name='product_filters[10]' and @id='elm_checkbox_39_10_88']")
	private WebElement ClickOn_Asus;

	/*@FindBy(how=How.ID,using="[id='button_cart_217']")
	private WebElement AddToCart_Asus;*/

	@FindBy(how=How.XPATH,using="//div[@id='sw_elm_filter_1' and @class='ty-horizontal-product-filters-dropdown__wrapper cm-combination']")
	private WebElement Click_On_Price;

	@FindBy(how=How.XPATH,using="//span[@class='ui-slider-handle ui-state-default ui-corner-all']")
	private WebElement SliderA;

	@FindBy(how=How.XPATH,using="//span[@class='ui-slider-handle ui-state-default ui-corner-all']")
	private WebElement SliderB;

	@FindBy(how=How.XPATH,using="//div[@id='sw_elm_filter_7']")
	private WebElement Click_On_Os;

	@FindBy(how=How.XPATH,using="//input[@class='cm-product-filters-checkbox'  and  @id='elm_checkbox_39_7_66']")
	private WebElement Click_On_Android;

	@FindBy(how=How.XPATH,using="//div[@id='sw_elm_filter_8']")
	private WebElement Click_On_Display;

	@FindBy(how=How.XPATH,using="//input[@class='cm-product-filters-checkbox' and @type='checkbox' and @id='elm_checkbox_39_8_63']")
	private WebElement Click_On_Size;

	@FindBy(how=How.XPATH,using="//div[@id='sw_elm_filter_9']")
	private WebElement Click_On_StorageCapacity;

	@FindBy(how=How.XPATH,using="//input[@class='cm-product-filters-checkbox' and @id='elm_checkbox_39_9_45']")
	private WebElement ClickOn_Capacity;
    
	public void My_Account() 
	{
		My_Account.click();
		}
	public void Sign_in()
	{
		Sign_in.click();
		}
	public void Username()
	{
		Username.clear();
		Username.sendKeys("customer@example.com");
	}

	public void Password()
	{
		Password.clear();
		Password.sendKeys("customer");
	}

	public void Sign_In_Log()
	{
		Sign_In_Log.click();
	}

	public void Search_Computer()
	{
		Search_Computer.sendKeys("computer");
	}
	public void Click_On_Computer()
	{
		Click_On_Computer.click();
	}
	public void Click_on_Brand()
	{
		Click_on_Brand.click();
	}
	public void ClickOn_Asus()
	{
		ClickOn_Asus.click();
		
	}
	public void  Click_On_Price()
	{
		 Click_On_Price.click();
	}
	public void Pause()
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		SliderA=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']")));
		//SliderA.click();
	}
	public void SliderA()
	{
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(SliderA, 50, 0).build().perform();
		 SliderA.click();	 
		 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		}
	public void SliderB()
	{
		Actions action = new Actions(driver);
		action.dragAndDropBy(SliderB, -90, 0).build().perform();
		 SliderB.click();
		 try
		 {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		 {
			e.printStackTrace();
		}
	}

	public void  Click_On_Os()
	{
		 Click_On_Os.click();
	}

	public void  Click_On_Android()
	{
		 Click_On_Android.click();
	}

	public void Pause2()
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		Click_On_Android=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ty-btn__primary ty-btn__big ty-btn__add-to-cart cm-form-dialog-closer ty-btn']")));
		//SliderA.click();
	}

	public void  Click_On_Display()
	{
		 Click_On_Display.click();
	}
	public void  Click_On_Size()
	{
		Click_On_Size.click();
	}
	public void  Click_On_StorageCapacity()
	{
		Click_On_StorageCapacity.click();
	}
	public void ClickOn_Capacity()
	{
		 ClickOn_Capacity.click();	
	}
	}



