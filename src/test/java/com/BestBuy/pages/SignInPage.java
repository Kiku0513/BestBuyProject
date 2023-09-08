package com.BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.utils.SeWrappers;

public class SignInPage extends SeWrappers
{
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement unitedState; 
	
	@FindBy(xpath="//button[@id='account-menu-account-button']//*[name()='svg']")
	WebElement accountBtn;
	
	@FindBy(xpath="//a[normalize-space()='Sign In']")
	WebElement signIn;
	
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement mailId;
	
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement togglebtn;

	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement pass;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement signInBtn;
	
	
	SeWrappers se=new SeWrappers();
	public void signInpage(String mail,String pwd ) 
	{
		se.click(unitedState);
		se.click(accountBtn);
		se.click(signIn);
		se.actionSendkeys(mailId, mail);
		se.click(togglebtn);
		se.actionSendkeys(pass, pwd);
		se.actionClick(signInBtn);
		
	}
	
	
}
