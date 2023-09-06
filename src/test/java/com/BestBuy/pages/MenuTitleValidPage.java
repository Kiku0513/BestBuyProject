package com.BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.utils.SeWrappers;

public class MenuTitleValidPage  extends SeWrappers
{
	//top deal title
	@FindBy(xpath="//*[@class='bottom-nav']//*[contains(text(),'Top Deals')][1]")
	WebElement topdeal;

	@FindBy(xpath="//*[contains(text(),'Deal of the Day')][1]")
	WebElement dealOfDay;

	@FindBy(xpath="//*[contains(text(),'My Best Buy Memberships')][1]")
	WebElement mbmb;


	SeWrappers se=new SeWrappers();
	public void menuTitleValid() throws InterruptedException
	{
		se.actionClick(topdeal);
		se.screenshot("Top Deals");

		Thread.sleep(2000);
		se.actionClick(dealOfDay);
		se.screenshot("Deal of the day");
		se.actionClick(mbmb);
		se.screenshot("Membership");
	}



}
