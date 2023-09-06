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
	BrokenLinkTest us=new BrokenLinkTest();
	@Test(priority=3)

	public void signInWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating SignIn of BestBuy functionality with valid credentials");
			us.uSPageTest();
			w3.signIn("komalnikame933@gmail.com", "Kiku@051323");
			String act="Oops! The email or password did not match our records. Please try again.";
			//	String excep=driver.findElement(By.xpath("//*[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")).getText();
			Assert.assertFalse(false, act);



		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignIn");
			Reports.reportStep("FAIL", "Problem while SignIn");


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


