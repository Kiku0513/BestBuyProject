package com.BestBuy.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class MainPageClick extends SeWrappers
{


	BestBuyWrappers w3=new BestBuyWrappers ();
	SeWrappers se=new  SeWrappers();
	
	
	@Test
	public void mainPageClick()
	{
		try
		{
			Reports.setTCDesc("Validating usClick of BestBuy functionality ");
			se.launchBrowser();
			w3.Uspage();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Validating bottomLinks");
			Reports.reportStep("FAIL", "Problem while Validating usClick");

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





