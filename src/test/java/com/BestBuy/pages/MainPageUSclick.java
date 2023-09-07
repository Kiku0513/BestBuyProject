package com.BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.utils.SeWrappers;

public class MainPageUSclick extends SeWrappers
{
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement unitedState; 
	
	
	public void clickUs()
	{
		click(unitedState);	
	}

}
