package com.automationfraternity.product.ecomcscart.po;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.automationfraternity.core.CmnMethods;
import com.automationfraternity.core.UIManager;
import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.org.glassfish.gmbal.Description;

/**
 * 
 * @author Suraj/DigvijaySingh
 * 
 */

public class PO_ViewCart {
	UIManager UIM = new UIManager();

	static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(how = How.ID, using = "sw_dropdown_8")
	@Description("WebElement for myCart Logo")
	private WebElement my_cart_logo;

	@FindBy(how = How.LINK_TEXT, using = "View cart")
	@Description("WebElement for View Cart Button")
	private WebElement view_cart_button;

	@FindBy(how = How.CLASS_NAME, using = "ty-mainbox-title")
	@Description("WebElement for cart contents Text")
	private WebElement text_cart_contents;

	@FindBy(how = How.XPATH, using = "//div[@class='buttons-container ty-cart-content__top-buttons clearfix']//div[@class='ty-float-left ty-cart-content__left-buttons']//a[1]")
	@Description("Webelement for upper left side continue shopping button")
	private WebElement upper_left_continue_shopping_button;

	@FindBy(how = How.XPATH, using = "//div[@class='buttons-container ty-cart-content__top-buttons clearfix']//div[@class='ty-float-left ty-cart-content__left-buttons']//a[2]")
	@Description("WebElement for clear cart button")
	private WebElement upper_left_clear_cart_button;

	@FindBy(how = How.XPATH, using = "//div[@class='ty-float-right ty-cart-content__right-buttons']//button[@id='button_cart']")
	@Description("WebElement for upper right side Recalculate button")
	private WebElement upper_right_recalculate_button;

	@FindBy(how = How.XPATH, using = "//div[@class='buttons-container ty-cart-content__top-buttons clearfix']//div[@class='ty-float-right ty-cart-content__right-buttons']//a[text()='Proceed to checkout']")
	@Description("WebElement for upper right side Proceed to checkout button")
	private WebElement upper_right_proceed_checkout_button;

	@FindBy(how = How.XPATH, using = "//div[@class='buttons-container ty-cart-content__bottom-buttons clearfix']//div[@class='ty-float-left ty-cart-content__left-buttons']//a[text()='Continue shopping' and @class='ty-btn ty-btn__secondary ']")
	@Description("WebElement for bottom left side continue shopping button")
	private WebElement bottom_left_continue_shopping_button;

	@FindBy(how = How.XPATH, using = "//div[@class='ty-float-right ty-cart-content__right-buttons']//button[@id='button_cart']")
	@Description("Webelement for bottom right side recalculate button")
	private WebElement bottom_right_recalculate_button;

	@FindBy(how = How.XPATH, using = "//div[@class='buttons-container ty-cart-content__bottom-buttons clearfix']//div[@class='ty-float-right ty-cart-content__right-buttons']//a[@class='ty-btn ty-btn__primary ' and text()='Proceed to checkout']")
	@Description("Webelement for bottom right side proceed to checkout button")
	private WebElement bottom_right_proceed_checkout_button;

	@FindBy(how = How.XPATH, using = "//input[@id='coupon_field']")
	@Description("Webelement for Gift certificate or promo code text box")
	private WebElement gift_certificate_promo_text_box;

	@FindBy(how = How.XPATH, using = "//button[@title='Apply']")
	@Description("WebElement for Apply Button")
	private WebElement apply_button;

	@FindBy(how = How.ID, using = "opener_shipping_estimation_block")
	@Description("WebElement for calculate link")
	private WebElement calculate_link;

	@FindBy(how = How.ID, using = "sec_cart_total")
	@Description("Webelement for price text value for total cost")
	private WebElement total_cost_price_text_value;

	@FindBy(how = How.XPATH, using = "//li[@class='ty-cart-statistic__item ty-statistic-list-subtotal']//span[@class='ty-cart-statistic__value']//bdi//span")
	@Description("WebElement for sub class total text value")
	private WebElement sub_total_cost_value;

	@FindBy(how = How.XPATH, using = "//select[@id='elm_country']")
	@Description("WebElement for Calculate shopping cost pop up country dropdown")
	private WebElement calculate_shopping_cost_popup_select_country_dropdown;

	@FindBy(how = How.XPATH, using = "//select[@class='cm-state cm-location-estimation  ty-input-text-medium']")
	@Description("WebElement for Calculate shopping cost pop up State/province dropdown")
	private WebElement calculate_shopping_cost_popup_select_state_dropdown;

	@FindBy(how = How.XPATH, using = "//input[@id='elm_city']")
	@Description("WebElement for Calculate shopping pop up city text box")
	private WebElement calculate_shopping_cost_popup_city_text_box;

	@FindBy(how = How.XPATH, using = "//input[@id='elm_zipcode']")
	@Description("WebElement for Calculate shopping pop up zip-code text box")
	private WebElement calculate_shopping_cost_popup_zip_code_text_box;

	@FindBy(how = How.XPATH, using = "//div[@class='ty-estimation-buttons buttons-container buttons-container-picker']//a[@class='ty-btn ty-btn__secondary cm-external-click ']")
	@Description("WebElement for Calculate shopping cost pop up get rates button")
	private WebElement calculate_shopping_cost_popup_get_rates_button;

	@FindBy(how = How.XPATH, using = "//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
	@Description("WebElement for Calculate shopping cost pop up upper right hand side cross")
	private WebElement calculate_shopping_cost_popup_upper_right_hand_side_close_button;

	@FindBy(how = How.XPATH, using = "//div[@class='ty-estimation-buttons buttons-container buttons-container-picker']//a[@class='ty-btn ty-btn__secondary cm-external-click ty-float-right ty-estimation-buttons__rate text-button ']")
	@Description("WebElement for Calculate Shopping cost pop up recalculate rates button")
	private WebElement calculate_shopping_cost_recalculate_rates_button;

	@FindBy(how = How.XPATH, using = "//div[@class='ty-estimation-buttons buttons-container buttons-container-picker']//a[@class='ty-btn ty-btn__secondary cm-external-click cm-dialog-closer ']")
	@Description("WebElement for Calculate shopping cost popup select shipping method button")
	private WebElement calculate_shopping_cost_select_shipping_method;

	@FindBy(how = How.XPATH, using = "//div[@id='cart_items']//table//")
	@Description("WebElement for table rows in product cart")
	private WebElement table_rows_of_products_added_in_cart;

	@Description("webelement alert arising after clicking select custom shopping method")
	@FindBy(how = How.XPATH, using = "//div[@class='cm-notification-content notification-content alert alert-warning']")
	private WebElement alert_after_selecting_custom_shipping_method;

	@Description("webelement alert cross button arising after clicking select custom shopping method")
	@FindBy(how = How.XPATH, using = "//div[@class='cm-notification-content notification-content alert alert-warning']//button[@class='close cm-notification-close ' ]")
	private WebElement alert_cross_button_after_selecting_custom_shipping_method;

	@Description("webelement for change link")
	@FindBy(how = How.ID, using = "opener_shipping_estimation_block")
	private WebElement change_link_custom_shipping_method;

	@FindBy(how = How.XPATH, using = "//div[@class='ty-mainbox-container clearfix']//span[text()='Search results']")
	@Description("webelement for search result text")
	private WebElement search_result_text;

	@FindBy(how = How.XPATH, using = "//div[@class='ty-mainbox-container clearfix']//span[@class='ty-checkout__title']")
	@Description("Webelement for secure checkout text")
	private WebElement secure_checkout_text;

	// div[@class='ty-center ty-value-changer cm-value-changer']//a[2]

	/*
	 * // WebElement for table product images in column one
	 * 
	 * @FindBy(how = How.XPATH, using =
	 * "//div[@id='cart_items']//table//tbody//tr//td[@class='ty-cart-content__product-elem ty-cart-content__image-block']//div//a//img"
	 * ) private List<WebElement> table_product_image_column_one;
	 */

	/******************************
	 * END OF LOCATOR DECLARATIONS
	 ****************************************************/

	/*********************************
	 * METHODS
	 *********************************************/

	@Description("method to type data in gift_certificate_promo_text_box")
	public void enterDataInGiftCertificatePromoTextBox(String data_for_gift_promo_box) {
		// UIM.SetElementText(gift_certificate_promo_text_box, data_for_gift_promo_box);
		// js.executeScript("window.scrollBy(0,1000)");
		if (gift_certificate_promo_text_box.isDisplayed()) {
			Assert.assertEquals(true, true, "The gift-promo text box is successfully displayed on web page");
		}
	}

	// method to click on bottom_right_proceed_checkout_button
	public void clickBottomRightProceedCheckoutButton() {
		UIM.ClickElement(bottom_right_proceed_checkout_button);
	}

	// method to click on bottom_right_recalculate_button
	public void clickBottomRightRecalculateButton() {
		UIM.ClickElement(bottom_right_recalculate_button);
	}

	// Method to click on my cart logo
	public void clickMyCartLogo() {
		UIM.ClickElement(my_cart_logo);
	}

	// Method to click on view cart Button
	public void clickOnViewCartButton() {
		UIM.ClickElement(view_cart_button);
	}

	// Method to click on upper_left_continue_shopping_button
	public void clickUpperLeftContinueShoppingButton() {
		UIM.ClickElement(upper_left_continue_shopping_button);
	}

	public void handleAlertAfterSelectShippingMethod() {
		if (alert_after_selecting_custom_shipping_method.isDisplayed()) {
			// com.automationfraternity.core.CmnMethods.WriteLog(null, "Alert successfully
			// displayed");
			Alert alert = driver.switchTo().alert();
			alert.accept();
			String alertText = alert.getText();
			System.out.println(alertText);
			alert.dismiss();
		}

	}

	// Method to click on upper_left_clear_cart_button
	public void clickUpperLeftClearCartButton() {
		UIM.ClickElement(upper_left_clear_cart_button);
	}

	// Method to click on upper_right_recalculate_button
	public void clickUpperRightRecalculateButton() {
		UIM.ClickElement(upper_right_recalculate_button);
	}

	// method to click on upper_right_proceed_checkout_button
	public void clickUpperRightProceedCheckoutButton() {
		UIM.ClickElement(upper_right_proceed_checkout_button);
	}

	// method to click on bottom_left_continue_shopping_button
	public void clickBottomLeftContinueShoppingButton() {
		UIM.ClickElement(bottom_left_continue_shopping_button);
	}

	public void clickApplyButton() {
		UIM.ClickElement(apply_button);
	}

	public void clickCalculateLink() {
		UIM.ClickElement(calculate_link);
	}

	public void clickCalculateShoppingCostRecalculateRatesButton() {
		UIM.ClickElement(calculate_shopping_cost_recalculate_rates_button);
	}

	// Method to compare total_cost_price_text_value expected and actual text
	/**
	 * @param - String type variable(expected value used to compare with actual
	 *        value from web page)
	 * @return - void
	 */
	public void getTextValueTotalCostPriceTextValue(String string_total_cost_price_text_value__expected) {
		String string_total_cost_price_text_value_actual = UIM.GetElementText(total_cost_price_text_value);
		Assert.assertEquals(string_total_cost_price_text_value__expected.trim(),
				string_total_cost_price_text_value_actual.trim(), "Text matched");
	}

	// Method to compare sub_total_cost_value expected and actual text
	/**
	 * @param - String type variable(expected value used to compare with actual
	 *        value from web page)
	 * @return - void
	 */
	public void getTextValueSubTotalCostValue(String sub_total_cost_value_expected) {
		String sub_total_cost_value_actual = UIM.GetElementText(sub_total_cost_value);
		Assert.assertEquals(sub_total_cost_value_expected.trim(), sub_total_cost_value_actual.trim(), "Text matched");

	}

	// method for calculate_shopping_cost_popup_select_country_dropdown
	public void getDropDownDataForCalculateShoppingCostPopupSelectCountryDropDown(
			String data_for_calculate_shopping_cost_popup_select_country_dropdown) {
		if (data_for_calculate_shopping_cost_popup_select_country_dropdown.equals(null)) {
			Assert.assertEquals(false, true, "Please enter data for mandatory field");
		} else {
			Select calculate_shopping_cost_popup_select_country_dropdown_select = new Select(
					calculate_shopping_cost_popup_select_country_dropdown);
			calculate_shopping_cost_popup_select_country_dropdown_select
					.selectByVisibleText(data_for_calculate_shopping_cost_popup_select_country_dropdown);
		}

	}

	// method for calculate_shopping_cost_popup_select_state_dropdown
	public void getDropDownDataForCalculateShoppingCostPopupSelectStateDropDown(
			String data_for_calculate_shopping_cost_popup_select_state_dropdown) {
		Select calculate_shopping_cost_popup_select_state_dropdown_select = new Select(
				calculate_shopping_cost_popup_select_state_dropdown);
		calculate_shopping_cost_popup_select_state_dropdown_select
				.selectByVisibleText(data_for_calculate_shopping_cost_popup_select_state_dropdown);
	}

	// Method to enter data for calculate_shopping_cost_popup_city_text_box
	public void enterTextValueForCalculateShoppingCostPopupCityTextBox(
			String calculate_shopping_cost_popup_city_text_box_data) {
		UIM.SetElementText(calculate_shopping_cost_popup_city_text_box,
				calculate_shopping_cost_popup_city_text_box_data);
	}

	public void enterTextDataValueForCalculateShoppingCostPopupZipCodeTextBox(
			String calculate_shopping_cost_popup_zip_code_text_box_data) {
		UIM.SetElementText(calculate_shopping_cost_popup_zip_code_text_box,
				calculate_shopping_cost_popup_zip_code_text_box_data);
	}

	// method to click on calculate_shopping_cost_popup_get_rates_button
	public void clickCalculateShoppingCostPopupGetRatesButton() {

		if (calculate_shopping_cost_popup_get_rates_button.isDisplayed()) {
			UIM.ClickElement(calculate_shopping_cost_popup_get_rates_button);
		}
	}

	// Method to click on
	// calculate_shopping_cost_popup_upper_right_hand_side_close_button
	public void clickCalculateShoppingCostPopupUpperRightHandSideCloseButton() {
		UIM.ClickElement(calculate_shopping_cost_popup_upper_right_hand_side_close_button);
	}

	public void clickCalculateShoppingCostSelectShippingMethod() {
		UIM.ClickElement(calculate_shopping_cost_select_shipping_method);
	}

	// Method to get table data for Product table on view cart page
	/**
	 * @param - no parameters
	 * @return - void
	 */
	public void getProductTableData() {

		UIM.GetUITableText(table_rows_of_products_added_in_cart);
	}

	public boolean isClicked(WebElement _locator) {
		// bottom_right_recalculate_button
		// upper_right_recalculate_button
		_locator.click();
		CmnMethods.WriteLog("info", "Clicked on Element: " + _locator.toString());
		return true;
	}

	public void recalculateUpperButtonFunctionality() {
		buttonsUpperAndLowerOnViewCartPage("Recalculate increment", upper_right_recalculate_button, null);

	}

	public void recalculateLowerButtonFunctionality() {
		buttonsUpperAndLowerOnViewCartPage("Recalculate decrement", null, bottom_right_recalculate_button);
	}
	

	public void continueShoppingUpperButtonFunctionality() {
		buttonsUpperAndLowerOnViewCartPage("Continue shopping", upper_left_continue_shopping_button, null);

	}

	public void continueShoppingLowerButtonFunctionality() {

		buttonsUpperAndLowerOnViewCartPage("Continue shopping", null, bottom_left_continue_shopping_button);
	}

	public void proceedToCheckoutUpperButtonFunctionality() {
		buttonsUpperAndLowerOnViewCartPage("Proceed to checkout", upper_right_proceed_checkout_button, null);
	}

	public void proceedToCheckoutLowerButtonFunctionality() {
		buttonsUpperAndLowerOnViewCartPage("Proceed to checkout", null, bottom_right_proceed_checkout_button);
	}

	public void calculateRecalculateFunctionality(int choice_which_product_is_to_be_increased_by_index, String xpath) {
		List<WebElement> li = driver
				.findElements(By.xpath(xpath));
		for(WebElement element:li) {
		
			Actions builder = new Actions(driver);
			builder.keyDown(Keys.CONTROL)
			.click(element)
			.keyUp(Keys.CONTROL);
			
			org.openqa.selenium.interactions.Action selectMultiple = builder.build();
			selectMultiple.perform();
		
		}
		//li.get(choice_which_product_is_to_be_increased_by_index).click();
	}

	public void buttonsUpperAndLowerOnViewCartPage(String choice_for_button, WebElement _locatorUpper,
			WebElement _locatorLower) {

		switch (choice_for_button) {
		case "Recalculate increment":
			UIM.GetUITableText(table_rows_of_products_added_in_cart);
			calculateRecalculateFunctionality(1,"//div[@class='ty-center ty-value-changer cm-value-changer']//a[1]");
			if (isClicked(_locatorUpper) || isClicked(_locatorLower)) {

				UIM.GetUITableText(table_rows_of_products_added_in_cart);
			}
			break;
		case "Recalculate decrement":
			UIM.GetUITableText(table_rows_of_products_added_in_cart);
			calculateRecalculateFunctionality(1,"//div[@class='ty-center ty-value-changer cm-value-changer']//a[2]");
			if (isClicked(_locatorUpper) || isClicked(_locatorLower)) {

				UIM.GetUITableText(table_rows_of_products_added_in_cart);
			}
			break;
			
		case "Continue shopping":
			if (isClicked(_locatorUpper) || isClicked(_locatorLower)) {

				if (search_result_text.isDisplayed()) {
					Assert.assertEquals(true, true,
							"after clicking continue shopping and navigating on new page open successfully");
				}

			}

			break;
		case "Proceed to checkout":

			if (isClicked(_locatorUpper) || isClicked(_locatorLower)) {

				String actual_text = secure_checkout_text.getText();
				String expected_text = "Secure checkout ";
				Assert.assertEquals(actual_text.trim(), expected_text.trim(),
						"text matched and proceed to checkout work successfully");

			}

			break;

		}
		// writing switch statement for upper and lower buttons

	}

	public void handleCalculateLinkFunctionality(String data_for_calculate_shopping_cost_popup_select_country_dropdown,
			String data_for_calculate_shopping_cost_popup_select_state_dropdown,
			String calculate_shopping_cost_popup_city_text_box_data,
			String calculate_shopping_cost_popup_zip_code_text_box_data) {
		clickCalculateLink();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		getDropDownDataForCalculateShoppingCostPopupSelectCountryDropDown(
				data_for_calculate_shopping_cost_popup_select_country_dropdown);

		getDropDownDataForCalculateShoppingCostPopupSelectStateDropDown(
				data_for_calculate_shopping_cost_popup_select_state_dropdown);

		enterTextValueForCalculateShoppingCostPopupCityTextBox(calculate_shopping_cost_popup_city_text_box_data);

		enterTextDataValueForCalculateShoppingCostPopupZipCodeTextBox(
				calculate_shopping_cost_popup_zip_code_text_box_data);

		clickCalculateShoppingCostPopupGetRatesButton();

	}

	public void calculateShippingCostPopUpRecalculateRates() {
		handleCalculateLinkFunctionality("", "", "", "");
		clickCalculateShoppingCostRecalculateRatesButton();

	}

	public void calculateShippingCostSelectShippingMethod() {
		handleCalculateLinkFunctionality("", "", "", "");
		clickCalculateShoppingCostSelectShippingMethod();
	}

	// method to let other resources access our web elements
	/**
	 * @param - Webelement _locator
	 * @return - returns a locator
	 */
	public static WebElement accessWebElement(WebElement _locator) {
		return _locator;
	}

} // end of class
