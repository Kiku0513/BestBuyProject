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
	UsTest us=new UsTest();
	@Test
	public void ItemsAddedCartTest()
	{
		try
		{
			Reports.setTCDesc("Validating ItemsAddedToCart functionality of BestBuy");
			us.uSPageTest();
			w3.searchItems("TV");
			w3.ItemsAdded("komalnikame933@gmail.com", "5555551234");
			String act="Sorry, there was a problem. Please try that again.";
			String excep=driver.findElement(By.xpath("//*[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none'][1]")).getText();
			Assert.assertEquals(act, excep);
			

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
