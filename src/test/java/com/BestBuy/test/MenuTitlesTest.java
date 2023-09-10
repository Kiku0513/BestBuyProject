package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class MenuTitlesTest extends SeWrappers
{

	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();
	@Test(priority=4)

	public void MenuTitlesValid()
	{
		try
		{
			Reports.setTCDesc(" MenusTitle functionality of BestBuy ");
			se.launchBrowser();
			w3.menuTitle();	
			String act="Meet the new My Best Buy Memberships™.";
			String except=driver.findElement(By.xpath("//*[contains(text(),'Meet the new My Best Buy Memberships™.')]")).getText();
			Assert.assertEquals(act, except);

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to get MenusTile");
			Reports.reportStep("FAIL", "Problem while MenusTitle Validation");


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
