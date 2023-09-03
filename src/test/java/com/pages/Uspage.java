package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.SeWrappers;

public class Uspage extends SeWrappers
{
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement unitedState; 
	
	public void clickONUnitedState()
	{
		click(unitedState);
	}
}
