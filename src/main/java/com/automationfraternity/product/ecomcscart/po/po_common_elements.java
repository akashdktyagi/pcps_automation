package main.java.com.automationfraternity.product.ecomcscart.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * 
 */
/**
 * @author Sarang and Chintan
 *
 */
public class po_common_elements
{
	
	
	//********************************************************************************
	//********************************************************************************
	//************************ Common Elements Locators ******************************
	//********************************************************************************
	//********************************************************************************
	
	//********************************************************************************
	//************************ My Account Dropdown Locators***************************
	
	@FindBy(how = How.XPATH,using="//div[@class='ty-dropdown-box  top-my-account ty-float-right']")
	private WebElement MyAccount_Click;
	
	@FindBy(how = How.XPATH,using="//a[text()='Orders' and @class='ty-account-info__a underlined']")
	private WebElement MyAccount_Orders_Click;
	
	@FindBy(how = How.XPATH,using="//a[text()='Comparison list' and @class='ty-account-info__a underlined']")
	private WebElement MyAccount_ComparisonList_Click;
	
	@FindBy(how = How.XPATH,using="//a[text()='Wish list' and @class='ty-account-info__a']")
	private WebElement MyAccount_WishList_Click;
	
	@FindBy(how = How.XPATH,using="//input[@name='hint_track_data' and @class='ty-input-text cm-hint']")
	private WebElement MyAccount_TrackMyOrder_TextBox;
	
	@FindBy(how = How.XPATH,using="//button[@title='Go' and @class='ty-btn-go' and @type='submit']")
	private WebElement MyAccount_TrackMyOrder_GoButton;
	
	@FindBy(how = How.XPATH,using="//a[text()='Sign in']")
	private WebElement MyAccount_SignIn_Button;
	
	@FindBy(how = How.XPATH,using="//a[text()='Register']")
	private WebElement MyAccount_Register_Button;
	
	
	//*************************************************************************************
	//************************ Search Box Locators ****************************************
	
	@FindBy(how = How.XPATH,using="//input[@id='search_input' and @title='Search products']")
	private WebElement Search_Input_TextBox; 
	
	@FindBy(how = How.XPATH,using="//button[@title='Search' and @type='submit']")
	private WebElement Search_Input_EnterButton;

	
	//************************************************************************************
	//************************ SignIn User Page Locators *********************************
	
	@FindBy(how = How.XPATH,using="//input[@id='login_popup4' and @name='user_login']")
	private WebElement SignIn_User_EmailID_Input_TextBox;
	
	@FindBy(how = How.XPATH,using="//input[@id='psw_popup4' and @name='password']")
	private WebElement SignIn_User_Password_Input_TextBox;
	
	@FindBy(how = How.XPATH,using="//a[text()='Forgot your password?']")
	private WebElement SignIn_User_Forgot_Password_Link;
	
	@FindBy(how = How.XPATH,using="//a[text()='Register for a new account']")
	private WebElement SignIn_User_Register_For_New_User;
	
	@FindBy(how = How.XPATH,using="//input[@type='checkbox' and @name='remember_me']")
	private WebElement SignIn_User_Remember_Me_Checkbox;
	
	@FindBy(how = How.XPATH,using="//button[@class='ty-btn__login ty-btn__secondary ty-btn' and @name='dispatch[auth.login]']")
	private WebElement SignIn_User_Button;
	
	@FindBy(how = How.XPATH,using="//button[@type='button' and @title='Close']")
	private WebElement SignIn_User_Close_Window_Button;
	
	
	//*************************************************************************************
	//*************** After User Signed In Page Locators On My Account ********************
	
	@FindBy(how = How.XPATH,using="//a[text()='Profile details']")
	private WebElement User_Profile_Details;
	
	@FindBy(how = How.XPATH,using="//a[contains(text(),'My points')]")
	private WebElement User_My_Points;
	
	@FindBy(how = How.XPATH,using="//a[contains(text(),'Sign out')]")
	private WebElement User_SignOut_Button;
	
	//*************************************************************************************
	//*************** Mislenious Links at Header Bar  *************************************
	
	@FindBy(how = How.XPATH,using="//a[contains(text(),'Our blog')]")
	private WebElement Our_Blogs_link;
	
	@FindBy(how = How.XPATH,using="//a[contains(text(),'Gift certificates')]")
	private WebElement Gift_Certificates_link;
	
	@FindBy(how = How.XPATH,using="//a[contains(text(),'Our brands')]")
	private WebElement Our_Brands_link;
	
	@FindBy(how = How.XPATH,using="//a[@id='opener_call_request_block6' and @class='cm-dialog-opener cm-dialog-auto-size ']")
	private WebElement Request_a_Call_link;
	
	
	
	
	
	//********************************************************************************
	//********************************************************************************
	//************************ WebElement Clicker Method *****************************
	//********************************************************************************
	//********************************************************************************
	
	static public void ClickOnElement(WebElement _locator)
	{
		_locator.click();
	}
	
	static private void SendKeysInElement(WebElement _locator,String textInput)
	{
		SendKeysInElement(_locator, textInput);
	}

	
	
	
	//********************************************************************************
	//********************************************************************************
	//************************ Common Elements Methods *******************************
	//********************************************************************************
	//********************************************************************************
	
	//********************************************************************************
	//********** My Account Drop Down Page WebElements Invoking Methods **************
	
	public void Click_On_MyAccount()
	{
		ClickOnElement(MyAccount_Click);
	}
	
	public void Click_On_Orders()
	{
		ClickOnElement(MyAccount_Orders_Click);
	}
	
	public void Click_On_ComparisonList()
	{
		ClickOnElement(MyAccount_ComparisonList_Click);
	}
	
	public void Click_On_WishList()
	{
		ClickOnElement(MyAccount_WishList_Click);
	}
	
	public void TextInsert_On_TrackMyOrder(String OrderID)
	{
		SendKeysInElement(MyAccount_TrackMyOrder_TextBox, OrderID);
		ClickOnElement(MyAccount_TrackMyOrder_GoButton);
	}
	
	public void Click_On_SignIn()
	{
		ClickOnElement(MyAccount_SignIn_Button);
	}
	
	//********************************************************************************
	//****************** Signin Page WebElements Invoking Methods *********************
	
	public void TextInsert_On_UserEmailID(String Username)
	{
		SignIn_User_EmailID_Input_TextBox.clear();
		SendKeysInElement(SignIn_User_EmailID_Input_TextBox, Username);	
	}
	
	public void TextInsert_On_UserPassword(String Password)
	{
		SignIn_User_Password_Input_TextBox.clear();
		SendKeysInElement(SignIn_User_Password_Input_TextBox, Password);
	}
	
	public void Click_On_Remember_Me_Checkbox()
	{
		ClickOnElement(SignIn_User_Remember_Me_Checkbox);
	}
	
	public void Click_On_SignIn_User_Button()
	{
		ClickOnElement(SignIn_User_Button);
	}
	
	
	public void Click_On_Register_For_New_User()
	{
		ClickOnElement(SignIn_User_Register_For_New_User);
	}
	
	public void Click_On_Forgot_Password_Link()
	{
		ClickOnElement(SignIn_User_Forgot_Password_Link);
	}
	
	public void Click_On_SignIn_User_Close_Window_Button()
	{
		ClickOnElement(SignIn_User_Close_Window_Button);
	}
	
	//********************************************************************************
	//********** Register Page WebElements Invoking Methods **************************
	
	public void Click_On_RegisterUser()
	{
		ClickOnElement(MyAccount_Register_Button);
	}
	
	public void Click_On_RegisterUser(String New_User_Email_ID)
	{
		SendKeysInElement(SignIn_User_EmailID_Input_TextBox, New_User_Email_ID);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
