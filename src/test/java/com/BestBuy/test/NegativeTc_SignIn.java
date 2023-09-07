package com.BestBuy.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class NegativeTc_SignIn
{	
	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();

	@Test
	public void signInWithInValidCredentials()
	{
		try
		{
			Reports.setTCDesc(" SignIn of BestBuy functionality with Invalid credentials");
			se.launchBrowser();
			w3.signIn("komalnikame93333333@gmail.com", "Kiku@0513234444");
			se.screenshot("SignIn_InValidCred");
			se.navigateBack();
			w3.signIn("", "9876976555");
			se.screenshot("SignInWithEmptyText");

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignIn with InValid Credentials");
			Reports.reportStep("FAIL", "Problem while SignIn with Invalid Credentials");


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
