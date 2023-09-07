package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class AddedItemsCartTest extends SeWrappers
{

	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();
	MainPageClick mp=new MainPageClick ();
	@Test
	public void ItemsAddedCartTest()
	{
		try
		{
			Reports.setTCDesc("Validating ItemsAddedToCart functionality of BestBuy");
			mp.mainPageClick();
			w3.searchItems("TV");
			w3.ItemsAdded("komalnikame933@gmail.com", "5555551234");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Validate ItemsAddedToCart functionality ");
			Reports.reportStep("FAIL", "Problem while  ItemsAddedToCart functionality  Validation");


		}
	}
	
	

	@AfterMethod
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
