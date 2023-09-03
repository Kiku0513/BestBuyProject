package com.utils;

import org.openqa.selenium.support.PageFactory;

import com.pages.SignUpPage;
import com.pages.Uspage;
import com.utils.SeWrappers;
public class BestBuyWrappers extends SeWrappers
{
	SeWrappers se= new SeWrappers();


	public void signUpBestBuy(String fName ,String Lname,String mailId,String pass,String cnfPass,String mobNo)
	{
		try
		{		
			Uspage usPage= PageFactory.initElements(driver, Uspage.class);

			SignUpPage sgPage= PageFactory.initElements(driver, SignUpPage.class);
			usPage.clickONUnitedState();
			sgPage.signUp(fName,Lname,mailId,pass,cnfPass,mobNo);
			se.screenshot("SignUpPage");
			se.closeAllBrowsers();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
