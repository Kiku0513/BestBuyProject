package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class AddedItemsCartTest extends SeWrappers
{
	//tc 6,7,8
	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();
	@Test(priority=6)
	public void ItemsAddedCartTest()
	{
		try
		{
			Reports.setTCDesc("Validating ItemsAddedToCart functionality of BestBuy");
			se.launchBrowser();
			w3.searchItems("TV");
			w3.ItemsAdded(" 96701","komalnikame933@gmail.com", "5555551234");
			//Assert.assertFalse(false,"Sorry, there was a problem. Please try that again.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Validate ItemsAddedToCart functionality ");
			Reports.reportStep("FAIL", "Problem while  ItemsAddedToCart functionality  Validation");


		}
	}



	@AfterClass
	public void closeBrowser()
	{
		try
		{
			driver.close();
			Reports.reportStep("PASS", "Browser closed successfully");
		}
		catch(Exception ex)
		{
			System.out.println("Problem in closing the browser");
			Reports.reportStep("FAIL", "Problem in closing the browser");
			ex.printStackTrace();
		}
	}
}
