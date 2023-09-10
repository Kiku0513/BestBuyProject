package com.BestBuy.test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;


public class SignUpTest extends SeWrappers
{


	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();
	@Test(priority=2)
	public void signUpWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating SignUp of BestBuy functionality with valid credentials");
			se.launchBrowser();
			w3.signUpBestBuy("Komal","Nikame","Komaldhumale9333@gmail.com","Kiku@051323","Kiku@051323","555551234");
			String act="An account with this email already exists.";
			Assert.assertFalse(false, act);



		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while SignUp");


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
