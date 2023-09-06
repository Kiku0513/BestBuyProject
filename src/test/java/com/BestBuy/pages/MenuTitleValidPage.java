package com.BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.utils.SeWrappers;

public class MenuTitleValidPage  extends SeWrappers
{
	//top deal title
	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topdeal;


	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement dealOfDay;

	@FindBy(xpath="//a[text()='My Best Buy Memberships']")
	WebElement mbmb;


	SeWrappers se=new SeWrappers();
	public void menuTitleValid()
	{


		click(topdeal);
		String expectedTitle="Top Deals and Featured Offers on Electronics - Best Buy";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}
		se.screenshot("Top Deals");
	

		click(dealOfDay);
		expectedTitle="Deal of the Day: Electronics Deals - Best Buy";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}
		se.screenshot("Deal of the day");
		


		se.actionClick(mbmb);
		expectedTitle="My Best Buy Memberships";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}
		se.screenshot("Membership");
	}



}
