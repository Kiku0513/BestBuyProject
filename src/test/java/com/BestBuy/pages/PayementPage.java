package com.BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.utils.SeWrappers;

public class PayementPage extends SeWrappers
{
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement unitedState; 

	@FindBy(xpath="//input[@id='number']")
	WebElement cardNo;
	@FindBy(xpath="//input[@id='first-name']")
	WebElement name;
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lname;
	@FindBy(xpath="//div[@class='margin-between-form-elements']//div[@class='form-group v-medium ']")
	WebElement address;
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	@FindBy(xpath="//select[@id='state']")
	WebElement selState;
	@FindBy(xpath="//input[@id='postalCode']")
	WebElement zipCode;

	SeWrappers  se=new SeWrappers();
	public void payment(String cardNumber,String fname,String lastName,String addrres,String place,String vtext,String postalcode)
	{	
		se.actionClick(unitedState);
		se.actionSendkeys(cardNo,cardNumber);
		se.actionSendkeys(name, fname);
		se.actionSendkeys(lname, lastName);
		se.sendkeys(address, addrres);
		se.sendkeys(city, place);
		se.selectByVisibleText(selState, vtext);
		se.sendkeys(zipCode, postalcode);
	}


}
