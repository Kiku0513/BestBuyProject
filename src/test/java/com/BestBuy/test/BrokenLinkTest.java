package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class BrokenLinkTest extends SeWrappers
{

	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();

	@Test

	public void brokenLink()
	{
		try
		{
			Reports.setTCDesc("Validating BrokenLinkUrl of BestBuy functionality ");
			se.launchBrowser();
			w3.brokenLink();


		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Vlidate BrokenLinkUrl");
			Reports.reportStep("FAIL", "Problem while login");


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
