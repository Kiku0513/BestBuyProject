package com.BestBuy.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class PaymentPageTest
{
	public class AddedItemsCartTest extends SeWrappers
	{

		BestBuyWrappers w3=new BestBuyWrappers();
		SeWrappers se= new SeWrappers();

		@Test(enabled=false)

		public void MenuTitlesValid()
		{
			try
			{
				Reports.setTCDesc("Validating ItemsAddedToCart functionality of BestBuy");
				se.launchBrowser();
				w3.paymentcard("1234567890123456","komal","Nikame","Sukhwani Scarlet","pune","AP","41222");
				String act="Please enter a valid card number.";
				String exp=driver.findElement(By.xpath("//*[contains(text(),'Please enter a valid card number.')]")).getText();
				Assert.assertEquals(act, exp);

			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				System.out.println("Fail to Validate ItemsAddedToCart functionality ");
				Reports.reportStep("FAIL", "Problem while  ItemsAddedToCart functionality  Validation");


			}
		}


	}

}
