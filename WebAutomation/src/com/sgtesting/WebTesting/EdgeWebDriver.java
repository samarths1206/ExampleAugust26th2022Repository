package com.sgtesting.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeWebDriver {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		navigate1();
		closeBrowser();

	}
	private static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.edge.driver","D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\drivers\\msedgedriver.exe");
		oBrowser=new EdgeDriver();
		}
		catch(Exception s)
		{
			s.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.google.com/");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate1()
	{
		try
		{
			oBrowser.get("http://sgtestinginstitute.com/");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(10000);
		}
		catch(Exception s)
		{
			s.printStackTrace();
		}
	}

}
