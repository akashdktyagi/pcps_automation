package main.java.com.automationfraternity.product.ecomcscart.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.java.com.automationfraternity.product.ecomcscart.po.PO_CsCart_ProductType;




public class TC_CsCart_ProductType 
{
	WebDriver driver;

	@BeforeMethod
	public void beforemethod() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.cs-cart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void tc_Brand()
	{
	try
	{
		
		PO_CsCart_ProductType PO_Brand = PageFactory.initElements(driver, PO_CsCart_ProductType.class);
		PO_Brand.My_Account();
		PO_Brand.Sign_in();
		PO_Brand.Username();
		PO_Brand.Password();
		PO_Brand.Sign_In_Log();
		PO_Brand.Search_Computer();
		PO_Brand.Click_On_Computer();
		PO_Brand.Click_on_Brand();
		PO_Brand.ClickOn_Asus();
		

	}
	catch (Exception e) {
		Assert.fail("TC fail due to exception");
	}
	}
	@Test
	public void tc_Price()
	{
		try
		{
	
	PO_CsCart_ProductType PO_Brand = PageFactory.initElements(driver, PO_CsCart_ProductType.class);
	PO_Brand.My_Account();
	PO_Brand.Sign_in();
	PO_Brand.Username();
	PO_Brand.Password();
	PO_Brand.Sign_In_Log();
	PO_Brand.Search_Computer();
	PO_Brand.Click_On_Computer();
	PO_Brand.Click_On_Price();
	PO_Brand.Pause();
	PO_Brand.SliderA();
	PO_Brand.SliderB();
	}
	catch (Exception e)
		{
		Assert.fail("TC fail due to exception");
	}
	}
	@Test
	public void tc_Os()
	{
		try
		{
	
	PO_CsCart_ProductType PO_Brand = PageFactory.initElements(driver, PO_CsCart_ProductType.class);
	PO_Brand.My_Account();
	PO_Brand.Sign_in();
	PO_Brand.Username();
	PO_Brand.Password();
	PO_Brand.Sign_In_Log();
	PO_Brand.Search_Computer();
	PO_Brand.Click_On_Computer();
	PO_Brand. Click_On_Os();
	PO_Brand.Click_On_Android();

	PO_Brand.Pause2();

		}
		catch (Exception e) 
		{
			Assert.fail("TC fail due to exception");
		
		}
	}

	@Test
	public void tc_Display()
	{
		try
		{
	
	PO_CsCart_ProductType PO_Brand = PageFactory.initElements(driver, PO_CsCart_ProductType.class);
	PO_Brand.My_Account();
	PO_Brand.Sign_in();
	PO_Brand.Username();
	PO_Brand.Password();
	PO_Brand.Sign_In_Log();
	PO_Brand.Search_Computer();
	PO_Brand.Click_On_Computer();
	PO_Brand.Click_On_Display();
	PO_Brand.Click_On_Size();
		}
		catch (Exception e) {
			Assert.fail("TC fail due to exception");
		}
	}
	@Test
	public void tc_StorsgeCapacity()
	{
		try
		{
	
	PO_CsCart_ProductType PO_Brand = PageFactory.initElements(driver, PO_CsCart_ProductType.class);
	PO_Brand.My_Account();
	PO_Brand.Sign_in();
	PO_Brand.Username();
	PO_Brand.Password();
	PO_Brand.Sign_In_Log();
	PO_Brand.Search_Computer();
	PO_Brand.Click_On_Computer();	
	PO_Brand.Click_On_StorageCapacity();	
	}
	catch (Exception e) 
	{
		Assert.fail("TC fail due to exception");
	}
	}
	}

