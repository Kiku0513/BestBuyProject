package com.BestBuy.test;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import  java.io.FileInputStream;
import com.BestBuy.utils.BestBuyWrappers;
import com.BestBuy.utils.Reports;
import com.BestBuy.utils.SeWrappers;

public class SignInTest_DataProvider extends SeWrappers
{

	BestBuyWrappers w3=new BestBuyWrappers();
	SeWrappers se= new SeWrappers();
	
	

	@DataProvider(name="fetchData")
	public Object[][] readExcel() throws IOException
	{
		Object[][] data=null;
		XSSFWorkbook workbook=null;
		try
		{
			
			//FileInputStream fs=new FileInputStream("C:\\Users\\ashis\\Desktop\\ReadDataForLoginInBestBuy.xlsx");
			workbook= new XSSFWorkbook(new FileInputStream("C:\\Users\\ashis\\eclipse-workspace\\com.BestBuyProject\\ReadDataForLoginInBestBuy.xlsx"));
			XSSFSheet sheet= workbook.getSheet("LoginValid");
			XSSFRow row= sheet.getRow(0);
			
			int noOfRows=sheet.getPhysicalNumberOfRows();
			
			int noOfCells= row.getPhysicalNumberOfCells();
			
			data= new Object[noOfRows-1][noOfCells]; //data[5][2]
			
			for(int i=1; i<noOfRows;i++)
			{
				for(int j=0; j<noOfCells;j++)
				{
					String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();
					data[i-1][j]=cellValue; 
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			workbook.close();
		}
		
		return data;
	}
	@Test(dataProvider="fetchData",priority=3)
	public void signIn(String mailId,String mobNo)
	{
		try
		{
			Reports.setTCDesc(" SignIn of BestBuy functionality with Invalid credentials");
			se.launchBrowser();
			w3.signIn(mailId,mobNo);
			se.screenshot("SignIn_ValidCred_Datap");
			Assert.assertFalse(false);

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignIn with InValid Credentials");
			Reports.reportStep("FAIL", "Problem while SignIn with Invalid Credentials");


		}
	}
	@AfterMethod
	public void closeBrowser()
	{
		try
		{
			se.closeAllBrowsers();
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
