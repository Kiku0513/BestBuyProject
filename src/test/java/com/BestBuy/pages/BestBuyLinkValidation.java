package com.BestBuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.utils.SeWrappers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BestBuyLinkValidation extends SeWrappers
{
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement unitedState; 

	public void brokenLinvkValid()
	{	
		String urlToCheck = "https://www.bestbuy.com/";

		try 
		{
			URL url = new URL(urlToCheck);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("HEAD");
			int responseCode = connection.getResponseCode();

			if (responseCode != HttpURLConnection.HTTP_OK) {
				System.out.println("The URL '" + urlToCheck + "' is broken.");
			}
			else
			{
				System.out.println("The URL '" + urlToCheck + "' is not broken.");
			}
		}
		catch (IOException e)
		{
			System.out.println("An exception occurred, indicating a broken link.");
		}

		click(unitedState);
	}
}
