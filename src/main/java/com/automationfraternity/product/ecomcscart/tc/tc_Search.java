/*
 * @author Pallavi A
 * Dt: 05/02/2019
 */

package main.java.com.automationfraternity.product.ecomcscart.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.java.com.automationfraternity.product.ecomcscart.po.Po_Search;

public class tc_Search 
{
	WebDriver driver;
	@Test
	public void tc_smoketest_search_by_brand() throws InterruptedException
	{
		Po_Search rv = PageFactory.initElements(driver, Po_Search.class);
		rv.add_cart();
	}

	@BeforeMethod
	public void beforeMethod() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.cs-cart.com/stores/198ed4a2c2e1a71e/?subcats=Y&pcode_from_q=Y&pshort=Y&pfull=Y&pname=Y&pkeywords=Y&search_performed=Y&q=computer&dispatch=products.search&security_hash=032212cb79f2b15257d9f1705b3b7b86");
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumm\\All_Drivers\\chromedriver.exe");

	} 
}
