package com.BestBuy.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class NegativeTc_SignUp 
{    
	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();
	UsTest us=new UsTest();


	@Test

	public void signUpWithInValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating SignUp of BestBuy functionality with Invalid credentials");
			us.uSPageTest();
			w3.signUpBestBuy("" ,"Nikame", "komalnikame93333@gmail.com","Kiku@05144323","Kiku@0251323","(555) 555-1234");
			se.screenshot("InValidCredSignUp1");
			w3.signUpBestBuy("11111" ,"22222", "93333@gmail.com","05144323","0251323","(555) 555-1234");
			se.screenshot("SignUpWithNumbers");

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
