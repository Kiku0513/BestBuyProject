package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.*;


public class BottomLinksTest  extends SeWrappers
{
	BestBuyWrappers w3=new BestBuyWrappers ();
	SeWrappers se=new  SeWrappers();
	
	@Test(priority=5)
	public void bottomLinksValid()
	{
		try
		{
			Reports.setTCDesc("Validating bottomLinks  functionality of BestBuy");
			se.launchBrowser();
			w3.bottomLinks();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Validating bottomLinks");
			Reports.reportStep("FAIL", "Problem while Validating bottomLinks");

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



