package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class PaymentPageTest  extends SeWrappers//tc 9
{
	AddedItemsCartTest add=new AddedItemsCartTest();
	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();

	@Test(enabled=false,priority=7)

	public void MenuTitlesValid()
	{
		try
		{
			Reports.setTCDesc("Validating PaymentPage functionality of BestBuy");
			add.ItemsAddedCartTest();
		//	w3.paymentcard("1234567890123456","komal","Nikame","Sukhwani Scarlet","pune","AP","41222","Kiku@05132333");
			se.screenshot("PaymentPage");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Validate PaymentPage functionality ");
			Reports.reportStep("FAIL", "Problem while  Payment functionality  Validation");


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
