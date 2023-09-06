package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class UsTest extends SeWrappers
{

	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();

	@Test

	public void uSPageTest()
	{
		try
		{
			Reports.setTCDesc("Validating SignUp of BestBuy functionality with valid credentials");
			se.launchBrowser("https://www.bestbuy.com/");
			w3.brokenLink();


		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while login");


		}
	}

}
