package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.SeWrappers;

public class SignUpPage  extends SeWrappers
{

	@FindBy(xpath="//button[@id='account-menu-account-button']//*[name()='svg']")
	WebElement acountMenuButton; 

	@FindBy(xpath="//a[normalize-space()='Create Account']")
	WebElement createAccount; 

	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;

	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName; 

	@FindBy(xpath="//input[@id='email']")
	WebElement email; 

	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement toggleButton; 
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password; 
	
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement cnfrmPass;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement phoneNo; 
	
	@FindBy(xpath="//button[contains(text(),'Create an Account')]")
	WebElement createAccountButton;
	
	public void signUp(String fName ,String Lname,String mailId,String pass,String cnfPass,String mobNo)
	{
		click(acountMenuButton);
		click(createAccount);
		sendkeys(firstName,fName);
		sendkeys(lastName,Lname);
		sendkeys(email,mailId);
		click(toggleButton);
		sendkeys(password,pass);
		sendkeys(cnfrmPass,cnfPass);
		sendkeys(phoneNo,mobNo);
		click(createAccountButton);
		
	}
}