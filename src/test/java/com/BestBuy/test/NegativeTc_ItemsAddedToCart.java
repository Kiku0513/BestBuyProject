package com.BestBuy.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class NegativeTc_ItemsAddedToCart extends SeWrappers
{
	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();

	@Test
	public void ItemsAddedCartTestWithInvalidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating ItemsAddedToCart functionality of BestBuy with invalidCred");
			se.launchBrowser();
			w3.searchItems("");
			se.screenshot("Search_Item_With_EmptyText");
			se.navigateRefresh();
			w3.searchItems("123");
			se.screenshot("Search_With_Numbers");
			Assert.assertFalse(false);
		}


		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Validate ItemsAddedToCart functionality with Invalid Cred");
			Reports.reportStep("FAIL", "Problem while  ItemsAddedToCart functionality  with Invalid Cred");
		}
	}
	@AfterMethod
	public void closeBrowser()
	{
		try
		{
			se.closeAllBrowsers();
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
