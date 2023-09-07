package com.BestBuy.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class NegativeTc_SignUp 
{    
	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();

	@Test

	public void signUpWithInValidCredentials()
	{
		try
		{
			Reports.setTCDesc("SignUp of BestBuy functionality with Invalid credentials");
			se.launchBrowser();
			w3.signUpBestBuy("" ,"Nikame", "komalnikame93333@gmail.com","Kiku@05144323","Kiku@0251323","(555) 555-1234");
			se.screenshot("InValidCredSignUp1");
			se.navigateBack();
			w3.signUpBestBuy("11111" ,"kame", "93333@gmail.com","K0514323","0251323","(555) 555-1234");
			se.screenshot("SignUpWithNumbers");
			Assert.assertFalse(true);

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp with InValid Cred");
			Reports.reportStep("FAIL", "Problem while SignUp with Invalid Cred");


		}
	}

	@AfterMethod
	public void closeBrowser()
	{
		try
		{
			
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
