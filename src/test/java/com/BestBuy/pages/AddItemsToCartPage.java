package com.BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.utils.SeWrappers;

public class AddItemsToCartPage extends SeWrappers
{
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement unitedState; 
	
	@FindBy(xpath="//*[@placeholder='What can we help you find today?']")
	WebElement searchProduct;

	@FindBy(xpath="//span[@class='header-search-icon']")
	WebElement clickSearch;


	@FindBy(xpath="//div[@class='list-item  lv']//div[@class='sli-add-to-cart'][1]")
	WebElement addProduct1;

	@FindBy(xpath="//button[@class='c-button-link close-modal-x close-modal-button']")
	WebElement cancelbtn1;

	//add 2nd item-7th testcase
	@FindBy(xpath="//button[normalize-space()='Menu']")
	WebElement clickMenu;

	@FindBy(xpath="//button[normalize-space()='Appliances']")
	WebElement appliance;

	@FindBy(xpath="//button[normalize-space()='Small Kitchen Appliances']")
	WebElement smallKitchenApp;

	@FindBy(xpath="//a[normalize-space()='Air Fryers & Deep Fryers']")
	WebElement airFryer;


	@FindBy(xpath="//*[@data-button-state='ADD_TO_CART'][1]")
	WebElement addProduct2;

	@FindBy(xpath="//button[@data-track='Attach Modal: Close']")
	WebElement cancelbtn2;

	//choose brand-add 3rd item-8th test case
	@FindBy(xpath="//button[normalize-space()='Menu']")
	WebElement menuClick;

	@FindBy(xpath="//button[contains(text(),'Brands')]")
	WebElement brands;

	@FindBy(xpath="//*[@data-lid='ubr_shp_son']")
	WebElement sony;

	@FindBy(xpath="//*[contains(text(),'Sony home audio')][1]")
	WebElement sonyAudio;

	//js.executeScript("scrollBy(0,300)");
	@FindBy(xpath="//div[@class='fulfillment-add-to-cart-button']/div[1]")
	WebElement addProduct3;

	//9thTc
	@FindBy(xpath="//*[@class='top-nav-container-v2']//*[@class='c-button c-button-secondary c-button-sm c-button-block ']")
	WebElement goToCart;

	@FindBy(xpath="//*[@class='c-close-icon c-modal-close-icon']")
	WebElement cancelbtn3;

	@FindBy(xpath="//*[@class='fluid-large-view__sidebar']//*[@class='btn btn-lg btn-block btn-primary']")
	WebElement checkout;

	@FindBy(xpath="//button[contains(text(),'Continue as Guest')]")
	WebElement conGuest;

	//scroll bottom

	@FindBy(id="user.emailAddress")
	WebElement email;

	@FindBy(id="user.phone")
	WebElement phone;

	@FindBy(id="text-updates")
	WebElement textBox;

	@FindBy(xpath="//*[@class='btn btn-lg btn-block btn-secondary']")
	WebElement cntnBtn;

	@FindBy(xpath="//*[@class='error-spacing']")
	WebElement errormsg;

	SeWrappers se=new SeWrappers();

	public void searchBar(String searchText)
	{  
		click(unitedState);	
		se.sendkeys(searchProduct,searchText);
		se.actionClick(clickSearch);
	}
	public void addItemsToCart(String mail,String mobNo) throws InterruptedException
	{
		se.actionClick(addProduct1);
		se.actionClick(cancelbtn1);
		se.actionClick(clickMenu);
		se.actionClick(appliance);
		se.actionClick(smallKitchenApp);
		se.actionClick(airFryer);
		se.jsVerticalScroll(250);
		se.actionClick(addProduct2);
		se.actionClick(cancelbtn2);
		se.actionClick(menuClick);
		se.actionClick(brands);
		se.actionClick(sony);
		se.actionClick(sonyAudio);
		se.actionClick(addProduct3);
		Thread.sleep(2000);
		se.actionClick(goToCart);
		se.actionClick(cancelbtn3);
		Thread.sleep(2000);
		se.screenshot("AddedItemsToCart");
		se.actionClick(checkout);
		se.click(conGuest);
		se.actionSendkeys(email, mail);
		se.actionSendkeys(phone, mobNo);
		se.actionClick(textBox);
		se.verifySelected(textBox);
		se.actionClick(cntnBtn);
		
	}






}
