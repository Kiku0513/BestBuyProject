package com.BestBuy.utils;

import org.openqa.selenium.support.PageFactory;

import com.BestBuy.pages.AddItemsToCartPage;
import com.BestBuy.pages.BrokenLinkUrl;
import com.BestBuy.pages.BottomLinksValidation;
import com.BestBuy.pages.MenuTitleValidPage;
import com.BestBuy.pages.PayementPage;
import com.BestBuy.pages.SignInPage;
import com.BestBuy.pages.SignUpPage;
import com.BestBuy.utils.SeWrappers;
public class BestBuyWrappers extends SeWrappers
{
	SeWrappers se= new SeWrappers();
	

	public void brokenLink()
	{
		BrokenLinkUrl brlink= PageFactory.initElements(driver, BrokenLinkUrl.class);
		brlink.brokenLinvkValid();

	}

	public void signUpBestBuy(String fName ,String Lname,String mailId,String pass,String cnfPass,String mobNo)
	{
		try
		{		

			SignUpPage sgPage= PageFactory.initElements(driver, SignUpPage.class);
			sgPage.signUp(fName,Lname,mailId,pass,cnfPass,mobNo);


		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void bottomLinks()
	{
		try
		{		

			BottomLinksValidation btPage= PageFactory.initElements(driver, BottomLinksValidation.class);
			btPage.linksValidation();
			se.screenshot("BottomLinks");


		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void menuTitle()
	{
		try
		{		
			BrokenLinkUrl usPage= PageFactory.initElements(driver, BrokenLinkUrl.class);

			MenuTitleValidPage mPage= PageFactory.initElements(driver, MenuTitleValidPage.class);
			usPage.brokenLinvkValid();
			mPage.menuTitleValid();



		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void signIn( String mail,String pwd)
	{
		try
		{		

			SignInPage sinPage= PageFactory.initElements(driver, SignInPage.class);
			sinPage.signInpage(mail, pwd);



		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void ItemsAdded(String mail,String mobNo)
	{
		try
		{		
			Thread.sleep(2000);
			AddItemsToCartPage itemsaddPage= PageFactory.initElements(driver, AddItemsToCartPage.class);
			itemsaddPage.addItemsToCart( mail, mobNo);

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void searchItems(String searchItem)
	{
		try
		{		
			Thread.sleep(2000);
			AddItemsToCartPage itemsaddPage= PageFactory.initElements(driver, AddItemsToCartPage.class);
			itemsaddPage.searchBar(searchItem);

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void paymentcard(String cardNumber,String fname,String lastName,String addrres,String place,String vtext,String postalcode)
	{
		try
		{		
			PayementPage payPage= PageFactory.initElements(driver, PayementPage.class);
			payPage.payment(cardNumber,fname,lastName,addrres,place,vtext,postalcode);
			se.screenshot("Payment");


		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
