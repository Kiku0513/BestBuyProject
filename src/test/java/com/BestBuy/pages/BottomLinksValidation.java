package com.BestBuy.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.utils.SeWrappers;

public class BottomLinksValidation extends SeWrappers
{
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement unitedState; 
	
	@FindBy(xpath="//a[@class='body-copy-sm mr-200']")
	List<WebElement> bottomlink;

	SeWrappers se=new SeWrappers();

	public void linksValidation()
	{
		
		se.actionClick(unitedState);
		se.jsscrollDownBottom();

		int count=bottomlink.size();
		System.out.println(count);
		for(WebElement link:bottomlink)
		{
			String url=link.getAttribute("href");
			try {
				URL bottomurl = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) bottomurl.openConnection();
				connection.setRequestMethod("HEAD");
				int responseCode=connection.getResponseCode();

				if (responseCode != HttpURLConnection.HTTP_OK) {
					System.out.println("The URL '" + url + "' is novalidated.");
				} else {
					System.out.println("The URL '" + url + "' is validated.");
				}
			} catch (IOException e) {
				System.out.println("An exception occurred, indicating a broken link.");
			}

		}
         
	

	}
}
