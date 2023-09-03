package com.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BestBuyWrappers;
import com.utils.Reports;
import com.utils.SeWrappers;


public class SignUpTest extends SeWrappers
{
	
	
	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();
	
@Test
	
	public void signUpWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating SignUp of BestBuy functionality with valid credentials");
			se.launchBrowser("https://www.bestbuy.com/");
			w3.signUpBestBuy("Komal" ,"Nikame", "komalnikame933@gmail.com","Kiku@051323","Kiku@051323","(555) 555-1234");
		   //  Assert.assertEquals(false, null)
		
		
		
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while login");
			
			
		}
	}

     
}
