package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class SignInTest extends SeWrappers
{

	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();

	public void loginWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Login of BestBuy functionality with valid credentials");
			se.launchBrowser();
			w3.signIn("komalnikame933@gmail.com", "Kiku@051323");
			Assert.assertFalse(false);



		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Login");
			Reports.reportStep("FAIL", "Problem while Login");


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


